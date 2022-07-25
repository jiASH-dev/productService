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
@Table(name = "ssds")
@Getter
@Setter
public class Ssd {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_ssdId", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "drive_size_id")
    private DriveSize driveSize;

    @OneToOne
    @JoinColumn(name = "drive_form_factor_id")
    private DriveFormFactor driveFormFactor;

    @OneToOne
    @JoinColumn(name = "drive_connection_interface_id")
    private DriveConnectionInterface driveConnectionInterface;

    @OneToOne
    @JoinColumn(name = "chip_type_id")
    private ChipType chipType;

    @Column(name = "sequential_read_speed")
    private Integer sequentialReadSpeed;

    @Column(name = "sequential_write_speed")
    private Integer sequentialWriteSpeed;

    @Column(name = "amount")
    private Integer amount;

    @Entity
    @Table(name = "chip_types")
    @Getter
    @Setter
    public static class ChipType {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
        @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_chipTypeId", allocationSize = 1)
        @Column(name = "id")
        private Long id;

        @Column(name = "name")
        @Enumerated(value = EnumType.STRING)
        private EChipTypeName name;

        public enum EChipTypeName {
            QLC, TLC, MLC, SLC
        }
    }
}
