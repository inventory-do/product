package com.sarema.invenotrydo.product.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "items_inventory")
@Data @NoArgsConstructor @AllArgsConstructor
public class ItemsInventory implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @Column(name = "quantity_expected",nullable = false,columnDefinition = " int default 0")
    private int quantityExpected;
    @Column(name = "quantity_actual",nullable = false,columnDefinition = " int default 0")
    private int quantityActual;
    @Column(name = "notedescription")
    private String notedescription;
    @ManyToOne
    @JoinColumn(name = "inventory_id",nullable = false)
    private Inventory  inventory;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
