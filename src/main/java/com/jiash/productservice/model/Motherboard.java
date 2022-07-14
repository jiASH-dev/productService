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
@Table(name = "motherboards")
@Getter
@Setter
public class Motherboard {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_motherboardId", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "corp_motherboard_form_factor_id")
    private CaseMotherboardFormFactor formFactor;

    @OneToOne
    @JoinColumn(name = "socket_type_id")
    private SocketType socketType;

    @OneToOne
    @JoinColumn(name = "memory_type_id")
    private MemoryType memoryType;

    @OneToOne
    @JoinColumn(name = "memory_slots_number_id")
    private MemorySlotsNumber memorySlotsNumber;
}
