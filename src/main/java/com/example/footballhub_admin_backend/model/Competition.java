package com.example.footballhub_admin_backend.model;

import com.example.core.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Competition extends BaseEntity {
    @Id
    private Integer competitionId;

    private Integer areaId;

    private String name;

    private String code;

    private String type;

    private String logoUrl;

    private Integer currentSeasonId;
}
