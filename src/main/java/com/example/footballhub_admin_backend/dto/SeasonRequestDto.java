package com.example.footballhub_admin_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeasonRequestDto {
    private Integer season;

    private String competitionCode;
}
