package com.example.footballhub_admin_backend.controller;

import com.example.footballhub_admin_backend._core.message.ResponseMsg;
import com.example.footballhub_admin_backend.constant.Constant;
import com.example.footballhub_admin_backend.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constant.ApiService.PREFIX)
public class MatchController {
    @Autowired
    MatchService matchService;

    @CrossOrigin(origins = "/**")
    @RequestMapping(value = "/matches/updateManually", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public ResponseMsg<?> updateMatchManually() {
        return this.matchService.updateMatchManually();
    }
}
