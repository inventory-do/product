package com.sarema.invenotrydo.product.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "product_lot")
@Data @AllArgsConstructor @NoArgsConstructor
public class ProductLot implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @Column(name = "product_lot_code",nullable = false)
    @NotBlank
    private String productLotCode;
    @Column(name = "date_manufacred")
    @Temporal(TemporalType.DATE)
    private Date dateManufactured;
    @Column(name = "date_expired",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateExpired;
}
