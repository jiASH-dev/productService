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

    @Column(name = "amount")
    private Integer amount;

    @Entity
    @Table(name = "pump_noise_levels")
    @Getter
    @Setter
    public static class PumpNoiseLevel {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
        @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_pumpNoiseLevelId", allocationSize = 1)
        @Column(name = "id")
        private Long id;

        @Column(name = "value")
        @Enumerated(value = EnumType.STRING)
        private EPumpNoiseLevelValue value;

        public enum EPumpNoiseLevelValue {
            THIRTY, SIXTY
        }
    }

    @Entity
    @Table(name = "water_block_materials")
    @Getter
    @Setter
    public static class WaterBlockMaterial {

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

    @Entity
    @Table(name = "water_cooling_system_case_materials")
    @Getter
    @Setter
    public static class WaterCoolingSystemCaseMaterial {

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
}
