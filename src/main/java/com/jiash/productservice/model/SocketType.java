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
@Table(name = "socket_types")
@Getter
@Setter
public class SocketType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_socketTypeId", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @Enumerated(value = EnumType.STRING)
    private ESocketTypeName name;

    public enum ESocketTypeName {
        AM3, AM4, LGA1151, LGA1152, LGA1153
    }
}
