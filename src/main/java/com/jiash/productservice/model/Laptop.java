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
@Table(name = "laptops")
@Getter
@Setter
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_laptopId", allocationSize = 1)
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
    @JoinColumn(name = "hdd_id")
    private Hdd hdd;

    @OneToOne
    @JoinColumn(name = "ssd")
    private Ssd ssd;

    @ManyToMany
    @JoinTable(name = "laptops_memories",
            joinColumns = @JoinColumn(name = "laptop_id"),
            inverseJoinColumns = @JoinColumn(name = "memory_id"))
    private List<Memory> rams;
}
