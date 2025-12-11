package com.example.footballhub_admin_backend.service.impl;

import com.example.footballhub_admin_backend._core.message.ResponseMsg;
import com.example.footballhub_admin_backend.repository.MatchRepository;
import com.example.footballhub_admin_backend.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;

public class MatchServiceImpl implements MatchService {
    @Autowired
    MatchRepository matchRepository;

    @Override
    public ResponseMsg<?> updateMatchManually() {
        return ResponseMsg.newOKResponse();
    }
}
