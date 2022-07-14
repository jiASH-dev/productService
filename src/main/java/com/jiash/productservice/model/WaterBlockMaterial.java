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
@Table(name = "water_block_materials")
@Getter
@Setter
public class WaterBlockMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_waterBlockMaterialId", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    @Enumerated(value = EnumType.STRING)
    private EWaterBlockMaterialType type;

    public enum EWaterBlockMaterialType {
        COPPER, ALUMINIUM
    }
}
