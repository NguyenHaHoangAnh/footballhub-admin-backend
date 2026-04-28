package com.example.footballhub_admin_backend.service;

import com.example.core.message.ResponseMsg;
import com.example.footballhub_admin_backend.dto.TeamRequestDto;

public interface TeamService {
    ResponseMsg<?> updateTeamManually(TeamRequestDto requestDto) throws Exception;

    ResponseMsg<?> findByTeamId(Integer teamId) throws Exception;
}
