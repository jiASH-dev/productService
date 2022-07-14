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
@Table(name = "corp_colors")
@Getter
@Setter
public class CaseColor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_corpColorId", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "value")
    @Enumerated(value = EnumType.STRING)
    private ECaseColor value;

    public enum ECaseColor {
        BLACK, WHITE, GRAY
    }
}
