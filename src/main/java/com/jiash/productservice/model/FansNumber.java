package com.jiash.productservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "fans_numbers")
@Getter
@Setter
public class FansNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_fansNumberId", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "value")
    private EFansNumber value;

    public enum EFansNumber {
        ONE, TWO
    }
}
