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
@Table(name = "vide_card_connection_interfaces")
@Getter
@Setter
public class VideoCardConnectionInterface {

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
