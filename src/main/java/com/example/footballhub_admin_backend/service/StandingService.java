package com.example.footballhub_admin_backend.service;

import com.example.core.message.ResponseMsg;
import com.example.footballhub_admin_backend.dto.StandingRequestDto;
import com.example.footballhub_admin_backend.dto.TeamRequestDto;

public interface StandingService {
    ResponseMsg<?> updateStandingManually(StandingRequestDto requestDto) throws Exception;

    ResponseMsg<?> findByCompetitionIdAndSeasonId(StandingRequestDto requestDto) throws Exception;
}
