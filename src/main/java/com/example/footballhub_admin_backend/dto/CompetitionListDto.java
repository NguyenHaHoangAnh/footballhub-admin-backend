package com.example.footballhub_admin_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompetitionListDto {
    private Integer count;

    private List<CompetitionDto> competitions;
}
