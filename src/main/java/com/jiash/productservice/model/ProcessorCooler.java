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
@Table(name = "processor_coolers")
@Getter
@Setter
public class ProcessorCooler {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_processorCoolerId", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "diameter")
    private Double diameter;

    @OneToOne
    @JoinColumn(name = "fans_number_id")
    private FansNumber fansNumber;

    @Column(name = "minimum_rotation_speed")
    private Integer minimumRotationSpeed;

    @Column(name = "maximum_rotation_speed")
    private Integer maximumRotationSpeed;

    @Column(name = "maximum_airflow")
    private Integer maximumAirflow;

    @OneToOne
    @JoinColumn(name = "connection_type_id")
    private ConnectionType connectionType;

    @Column(name = "maximum_noise_level")
    private Integer maximumNoiseLevel;

    @Column(name = "width")
    private Double width;

    @Column(name = "depth")
    private Double depth;

    @Column(name = "height")
    private Double height;

    @Column(name = "weight")
    private Double weight;

    @OneToOne
    @JoinColumn(name = "socket_type_id")
    private SocketType socketType;
}
