package com.example.footballhub_admin_backend.service.impl;

import com.example.core.message.ResponseMsg;
import com.example.core.util.HttpRequestUtil;
import com.example.core.util.Utils;
import com.example.footballhub_admin_backend.dto.AreaListDto;
import com.example.footballhub_admin_backend.service.AreaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AreaServiceImpl implements AreaService {
    @Value("${link.url.football-data-api}")
    private String footballDataApi;

    @Value("${football-data-api.x-auth-token}")
    private String xAuthToken;

    public ResponseMsg<?> update() throws Exception {
        try {
            String jsonResponse = HttpRequestUtil.sendGet(footballDataApi + "/areas", null, xAuthToken, 60);
            AreaListDto areaListDto = Utils.getGson().fromJson(jsonResponse, AreaListDto.class);

            return ResponseMsg.newOKResponse(areaListDto);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
