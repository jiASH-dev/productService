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
@Table(name = "drive_sizes")
@Getter
@Setter
public class DriveSize {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_driveSizeId", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "value")
    @Enumerated(value = EnumType.STRING)
    private EDriveSizeValue value;

    public enum EDriveSizeValue {
        ONE_HUNDRED_AND_TWENTY, TWO_HUNDRED_AND_FIFTY, FIVE_HUNDRED, TERABYTE
    }
}
