package com.example.footballhub_admin_backend.repository;

import com.example.core.repository.BaseRepo;
import com.example.footballhub_admin_backend.model.Standing;
import com.example.footballhub_admin_backend.model.Team;
import org.springframework.stereotype.Repository;

@Repository
public interface StandingRepository extends BaseRepo<Standing, Integer> {
    Standing findByCompetitionIdAndSeasonIdAndTeamId(Integer competitionId, Integer seasonId, Integer teamId);
}
