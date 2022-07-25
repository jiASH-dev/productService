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
@Table(name = "corps")
@Getter
@Setter
public class Case {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_corpId", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "corp_motherboard_form_factor_id")
    private CaseMotherboardFormFactor formFactor;

    @OneToOne
    @JoinColumn(name = "corp_color_id")
    private CaseColor corpColor;

    @Column(name = "width")
    private Double width;

    @Column(name = "height")
    private Double height;

    @Column(name = "amount")
    private Integer amount;

    @Entity
    @Table(name = "corp_colors")
    @Getter
    @Setter
    public static class CaseColor {

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
}
