package com.example.footballhub_admin_backend.controller;

import com.example.core.controller.BaseController;
import com.example.core.message.ResponseMsg;
import com.example.footballhub_admin_backend.constant.Constant;
import com.example.footballhub_admin_backend.model.Area;
import com.example.footballhub_admin_backend.repository.AreaRepository;
import com.example.footballhub_admin_backend.service.AreaService;
import com.example.footballhub_admin_backend.service.impl.AreaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constant.ApiService.PREFIX)
public class AreaController extends BaseController<Area, Integer, AreaRepository, AreaServiceImpl> {
    @Autowired
    AreaService areaService;

    @CrossOrigin(origins = "/**")
    @RequestMapping(value = "/areas/updateManually", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public ResponseMsg<?> updateManually() throws Exception {
        return this.areaService.updateManually();
    }

    @Override
    public void merge(Area newBean, Area currentBean) throws Exception {
        currentBean.setName(currentBean.getName());
        currentBean.setCountryCode(currentBean.getCountryCode());
        currentBean.setFlagUrl(currentBean.getFlagUrl());
        currentBean.setParentAreaId(currentBean.getParentAreaId());
        currentBean.setParentArea(currentBean.getParentArea());
    }
}
