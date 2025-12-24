package com.example.footballhub_admin_backend.model;

import com.example.core.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "area")
public class Area extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "area_generator")
    @SequenceGenerator(name = "area_generator", sequenceName = "area_seq", allocationSize = 1)
    @Column(name = "area_id", nullable = false)
    private Integer areaId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "flag_url")
    private String flagUrl;

    @Column(name = "parent_area_id")
    private Integer parentAreaId;

    @Column(name = "parent_area")
    private String parentArea;
}
