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
}
