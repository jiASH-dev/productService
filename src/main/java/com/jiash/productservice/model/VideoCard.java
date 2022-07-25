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
@Table(name = "video_cards")
@Getter
@Setter
public class VideoCard {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_videoCardId", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "video_memory_amount_id")
    private VideoMemoryAmount videoMemoryAmount;

    @Column(name = "vide_memory_frequency")
    private Integer videoMemoryFrequency;

    @OneToOne
    @JoinColumn(name = "video_memory_type_id")
    private VideoMemoryType videoMemoryType;

    @OneToOne
    @JoinColumn(name = "bus_bit_rate_id")
    private BusBitRate busBitRate;

    @OneToOne
    @JoinColumn(name = "video_card_connection_interface")
    private VideoCardConnectionInterface videoCardConnectionInterface;

    @Column(name = "amount")
    private Integer amount;

    @Entity
    @Table(name = "bus_bit_rates")
    @Getter
    @Setter
    public static class BusBitRate {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
        @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_busBitRateId", allocationSize = 1)
        @Column(name = "id")
        private Long id;

        @Column(name = "value")
        private Integer value;
    }

    @Entity
    @Table(name = "vide_card_connection_interfaces")
    @Getter
    @Setter
    public static class VideoCardConnectionInterface {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
        @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_videoCardConnectionInterfaceId", allocationSize = 1)
        @Column(name = "id")
        private Long id;

        @Column(name = "name")
        @Enumerated(value = EnumType.STRING)
        private EVideoCardConnectionInterfaceName name;

        public enum EVideoCardConnectionInterfaceName {
            DISPLAY_PORT, HDMI, DVI
        }
    }

    @Entity
    @Table(name = "video_memory_amounts")
    @Getter
    @Setter
    public static class VideoMemoryAmount {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
        @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_videoMemoryAmountId", allocationSize = 1)
        @Column(name = "id")
        private Long id;

        @Column(name = "value")
        @Enumerated(value = EnumType.STRING)
        private EVideoMemoryAmountValue value;

        public enum EVideoMemoryAmountValue {
            FOUR, SIX, EIGHT, TEN, TWELVE
        }
    }

    @Entity
    @Table(name = "video_memory_types")
    @Getter
    @Setter
    public static class VideoMemoryType {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
        @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_videoMemoryTypeId", allocationSize = 1)
        @Column(name = "id")
        private Long id;

        @Column(name = "name")
        @Enumerated(value = EnumType.STRING)
        private EVideoMemoryTypeName name;

        public enum EVideoMemoryTypeName {
            GDDR5, GDDR6
        }
    }
}
