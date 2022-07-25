package com.jiash.productservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "system_blocks")
@Getter
@Setter
public class SystemBlock {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_systemBlockId", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @OneToOne
    @JoinColumn(name = "video_card_id")
    private VideoCard videoCard;

    @OneToOne
    @JoinColumn(name = "processor_id")
    private Processor processor;

    @OneToOne
    @JoinColumn(name = "power_supply_id")
    private PowerSupply powerSupply;

    @OneToOne
    @JoinColumn(name = "motherboard_id")
    private Motherboard motherboard;

    @OneToOne
    @JoinColumn(name = "processor_cooler_id")
    private ProcessorCooler processorCooler;

    @OneToOne
    @JoinColumn(name = "corp_id")
    private Case corp;

    @OneToOne
    @JoinColumn(name = "hdd_id")
    private Hdd hdd;

    @OneToOne
    @JoinColumn(name = "ssd")
    private Ssd ssd;

    @ManyToMany
    @JoinTable(name = "system_blocks_memories",
            joinColumns = @JoinColumn(name = "system_block_id"),
            inverseJoinColumns = @JoinColumn(name = "memory_id"))
    private List<Memory> rams;

    @Column(name = "amount")
    private Integer amount;
}
