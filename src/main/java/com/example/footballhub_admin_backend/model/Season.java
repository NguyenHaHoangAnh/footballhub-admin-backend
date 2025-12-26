package com.example.footballhub_admin_backend.model;

import com.example.core.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Season extends BaseEntity {
    @Id
    private Integer seasonId;

    private Date startDate;

    private Date endDate;

    private Integer currentMatchDay;

    private Integer winnerId;
}
