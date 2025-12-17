package com.example.footballhub_admin_backend.service;

import com.example.core.message.ResponseMsg;

public interface MatchService {
    ResponseMsg<?> updateManually() throws Exception;
}
