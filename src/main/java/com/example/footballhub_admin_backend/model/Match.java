package com.example.footballhub_admin_backend.model;

import com.example.core.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Match extends BaseEntity {
    @Id
    private Integer matchId;

    private Integer areaId;

    private Integer competitionId;

    private Integer seasonId;

    private Date startDate;

    private String status;

    private Integer matchDay;

    private Integer homeTeamId;

    private Integer awayTeamId;

    private Integer scoreHome;

    private Integer scoreAway;
}
