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
@Table(name = "hdds")
@Getter
@Setter
public class Hdd {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_hddId", allocationSize = 1)
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

    @Column(name = "rotational_speed")
    private Integer rotationalSpeed;

    @Column(name = "buffer")
    private Integer buffer;

    @Column(name = "sequential_read_speed")
    private Integer sequentialReadSpeed;

    @Column(name = "amount")
    private Integer amount;
}
