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
public class Team extends BaseEntity {
    @Id
    private Integer teamId;

    private String name;

    private String shortName;

    private String crest;

    private String competitionId;
}
