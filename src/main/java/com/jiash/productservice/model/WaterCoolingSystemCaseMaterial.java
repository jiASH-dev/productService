package com.jiash.productservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "water_cooling_system_case_materials")
@Getter
@Setter
public class WaterCoolingSystemCaseMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_waterCoolingSystemCaseMaterialId", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    @Enumerated(value = EnumType.STRING)
    private EWaterCoolingSystemCaseMaterialType type;

    public enum EWaterCoolingSystemCaseMaterialType {
        PLASTIC, ALUMINIUM
    }
}
