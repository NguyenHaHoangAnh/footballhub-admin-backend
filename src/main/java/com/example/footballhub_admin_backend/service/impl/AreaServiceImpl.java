package com.example.footballhub_admin_backend.service.impl;

import com.example.core.message.ResponseMsg;
import com.example.core.service.AbstractCRUDService;
import com.example.core.util.HttpRequestUtil;
import com.example.core.util.Utils;
import com.example.footballhub_admin_backend.dto.AreaListDto;
import com.example.footballhub_admin_backend.model.Area;
import com.example.footballhub_admin_backend.repository.AreaRepository;
import com.example.footballhub_admin_backend.service.AreaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
@Service
public class AreaServiceImpl extends AbstractCRUDService<Area, Integer, AreaRepository> implements AreaService {
    @Value("${link.url.football-data-api}")
    private String footballDataApi;

    @Value("${football-data-api.x-auth-token}")
    private String xAuthToken;

    public ResponseMsg<?> updateManually() throws Exception {
        try {
            // Lấy data qua api bên thứ 3
            String jsonResponse = HttpRequestUtil.sendGet(footballDataApi + "/areas", null, xAuthToken, 60);
            AreaListDto areaListDto = Utils.getGson().fromJson(jsonResponse, AreaListDto.class);

            // Lấy data trong db
            List<Area> areas = this.findAll();

            // Tạo Set chứa các id đã tồn tại trong DB (để so sánh nhanh)
            Set<Integer> existingIds = areas.stream()
                    .map(Area::getAreaId)
                    .collect(Collectors.toSet());

            // Lọc lấy các data ko có trong db
            List<Area> newAreas = areaListDto.getAreas().stream()
                    .filter(dto -> !existingIds.contains(dto.getId()))
                    .map(dto -> {
                        Area newArea = new Area();
                        newArea.setAreaId(dto.getId());
                        newArea.setName(dto.getName());
                        newArea.setCountryCode(dto.getCountryCode());
                        newArea.setFlagUrl(dto.getFlag());
                        newArea.setParentAreaId(dto.getParentAreaId());
                        newArea.setParentArea(dto.getParentArea());

                        return newArea;
                    })
                    .collect(Collectors.toList());

            // Lưu vào db
            if (!newAreas.isEmpty()) {
                if (this.saveAllBeans(newAreas)) {
                    return ResponseMsg.newOKResponse(newAreas);
                } else {
                    return ResponseMsg.new500ErrorResponse();
                }
            }

            return ResponseMsg.newOKResponse(newAreas);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
