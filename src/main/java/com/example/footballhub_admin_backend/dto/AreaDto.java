package com.example.footballhub_admin_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AreaDto {
    private Integer id;

    private String name;

    private String countryCode;

    private String flag;

    private Integer parentAreaId;

    private String parentArea;
}
