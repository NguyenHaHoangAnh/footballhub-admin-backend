package com.example.footballhub_admin_backend.mapper;

import com.example.footballhub_admin_backend.dto.TeamResponseDto;
import com.example.footballhub_admin_backend.model.Team;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TeamMapper {
    TeamResponseDto findByTeamId(Integer teamId);

    @Select("""
            <script>
                select
                    t.team_id as teamId
                from football.team t
                join football.competition_team_map ctm on ctm.team_id = t.team_id
                join football.competition c on c.competition_id = ctm.competition_id
                where
                    ctm.competition_id = #{competitionId}
                    and c.current_season_id = #{seasonId}
            </script>
            """)
    List<Team> findByCompetitionIdAndSeasonId(
            @Param("competitionId") Integer competitionId,
            @Param("seasonId") Integer seasonId
    );
}
