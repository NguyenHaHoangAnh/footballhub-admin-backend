package com.example.footballhub_admin_backend.service.impl;

import com.example.core.message.ResponseMsg;
import com.example.footballhub_admin_backend.service.MatchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MatchServiceImpl implements MatchService {
    public ResponseMsg<?> updateManually() throws Exception {
        try {
            return ResponseMsg.newOKResponse();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
