package com.example.footballhub_admin_backend.dto;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeasonDto {
    private Integer id;

    private Date startDate;

    private Date endDate;

    private Integer currentMatchday;

    private TeamDto winner;
}
