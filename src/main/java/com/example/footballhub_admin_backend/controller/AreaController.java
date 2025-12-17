package com.example.footballhub_admin_backend.controller;

import com.example.core.message.ResponseMsg;
import com.example.footballhub_admin_backend.constant.Constant;
import com.example.footballhub_admin_backend.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constant.ApiService.PREFIX)
public class AreaController {
    @Autowired
    AreaService areaService;

    @CrossOrigin(origins = "/**")
    @RequestMapping(value = "/areas/update", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public ResponseMsg<?> update() throws Exception {
        return this.areaService.update();
    }
}
