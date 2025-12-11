package com.example.footballhub_admin_backend.service;

import com.example.footballhub_admin_backend._core.message.ResponseMsg;

public interface MatchService {
    ResponseMsg<?> updateMatchManually();
}
