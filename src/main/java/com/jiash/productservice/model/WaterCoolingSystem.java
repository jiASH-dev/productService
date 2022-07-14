package com.jiash.productservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "water_cooling_systems")
@Getter
@Setter
public class WaterCoolingSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_waterCoolingSystemId", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "socket_type_id")
    private SocketType socketType;

    @OneToOne
    @JoinColumn(name = "fans_number_id")
    private FansNumber fansNumber;

    @Column(name = "maximum_rotation_speed")
    private Integer maximumRotationSpeed;

    @OneToOne
    @JoinColumn(name = "water_block_material_id")
    private WaterBlockMaterial waterBlockMaterial;

    @OneToOne
    @JoinColumn(name = "connection_type_id")
    private ConnectionType connectionType;

    @OneToOne
    @JoinColumn(name = "water_cooling_system_case_material_id")
    private WaterCoolingSystemCaseMaterial waterCoolingSystemCaseMaterial;

    @OneToOne
    @JoinColumn(name = "pump_noise_level_id")
    private PumpNoiseLevel pumpNoiseLevel;
}
