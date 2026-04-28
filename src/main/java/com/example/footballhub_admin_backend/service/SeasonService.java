package com.example.footballhub_admin_backend.service;

import com.example.core.message.ResponseMsg;
import com.example.footballhub_admin_backend.dto.SeasonRequestDto;

public interface SeasonService {
    ResponseMsg<?> updateSeasonManually(SeasonRequestDto requestDto) throws Exception;

    ResponseMsg<?> findBySeasonId(Integer seasonId) throws Exception;

    ResponseMsg<?> findByCompetitionId(Integer competitionId) throws Exception;
}
