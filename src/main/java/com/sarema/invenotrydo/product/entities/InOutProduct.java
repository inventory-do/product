package com.sarema.invenotrydo.product.entities;

import com.sarema.invenotrydo.product.enumeration.StatInOut;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
@Entity
@Table(name = "in_out_product")
@Data @AllArgsConstructor @NoArgsConstructor
public class InOutProduct implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "warehouse_id",nullable = false)
    @NotNull
    private Warehouse warehouse;
    @Column(name = "describre",nullable = false)
    @NotBlank
    private String describe;
    @Column(name = "quantity",nullable = false)
    @NotNull
    private int quantity;
    @Column(name = "status_in_out",nullable = false)
    @NotBlank
    private StatInOut statInOut;
    @Column(name = "product_lot_id")
    private ProductLot productLot;

}
