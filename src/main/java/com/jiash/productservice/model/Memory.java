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
@Table(name = "memories")
@Getter
@Setter
public class Memory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_memoryId", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "memory_type_id")
    private MemoryType memoryType;

    @Column(name = "capacity")
    @Enumerated(EnumType.STRING)
    private EMemoryCapacity capacity;

    @Column(name = "price")
    private Double price;

    public enum EMemoryCapacity {
        FOUR, EIGHT, TWELVE, SIXTEEN
    }

    @Column(name = "amount")
    private Integer amount;
}
