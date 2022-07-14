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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "powers")
@Getter
@Setter
public class Power {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_powerId", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "value")
    @Enumerated(value = EnumType.STRING)
    private EPowerValue value;

    public enum EPowerValue {
        FOUR_HUNDRED, FOUR_HUNDRED_AND_FIFTY, FIVE_HUNDRED
    }
}
