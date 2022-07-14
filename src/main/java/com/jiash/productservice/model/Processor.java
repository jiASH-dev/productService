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
@Table(name = "processors")
@Getter
@Setter
public class Processor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_processorId", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "socket_type_id")
    private SocketType socketType;

    @OneToOne
    @JoinColumn(name = "cores_number_id")
    private CoresNumber coresNumber;

    @OneToOne
    @JoinColumn(name = "threads_number_id")
    private ThreadsNumber threadsNumber;

    @Column(name = "frequency")
    private Double frequency;

    @OneToOne
    @JoinColumn(name = "level_three_cache_id")
    private LevelThreeCache levelThreeCache;

    @OneToOne
    @JoinColumn(name = "technical_process_id")
    private TechnicalProcess technicalProcess;

    @OneToOne
    @JoinColumn(name = "tpd_id")
    private Tdp tdp;
}

