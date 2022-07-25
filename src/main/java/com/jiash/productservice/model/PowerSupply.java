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
@Table(name = "power_supplies")
@Getter
@Setter
public class PowerSupply {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_powerSupplyId", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "power_id")
    private Power power;

    @OneToOne
    @JoinColumn(name = "efficiency_id")
    private Efficiency efficiency;

    @Column(name = "amount")
    private Integer amount;

    @Entity
    @Table(name = "efficiencies")
    @Getter
    @Setter
    public static class Efficiency {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
        @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_efficiencyId", allocationSize = 1)
        @Column(name = "id")
        private Long id;

        @Column(name = "value")
        @Enumerated(value = EnumType.STRING)
        private EEfficiencyValue value;

        public enum EEfficiencyValue {
            BRONZE, SILVER, GOLD, PLATINUM, TITANIUM
        }
    }

    @Entity
    @Table(name = "powers")
    @Getter
    @Setter
    public static class Power {

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
}
