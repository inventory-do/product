package com.sarema.invenotrydo.product.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Table(name = "products")
public class Product implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @Column(name = "product_id")
    @NotBlank
    private String productID;
    @Column(name = "sku",nullable = false,unique = true)
    @NotBlank
    private String sku;
    @Column(name = "product_name_complet",nullable = false,unique = true)
    @NotBlank
    private String productNameComplet;
    @Column(name = "average_cost",nullable = false)
    @NotNull
    private Double averageCost;
    @Column(name = "selling_price",nullable = false)
    @NotNull
    private Double sellingPrice;
    @Column(name = "warning_terms")
    private String warningTerms;
    @Column(name ="has_lot",columnDefinition = "tinynint(1) default 0")
    private Boolean hasLot;
    @Column(name ="has_sale",columnDefinition = "tinynint(1) default 0")
    private Boolean hasSale;
    @Column(name ="has_purchage",columnDefinition = "tinynint(1) default 0")
    private Boolean hasPurchage;
    @Column(name ="has_inventory",columnDefinition = "tinynint(1) default 0")
    private Boolean hasInventory;
    @Column(name ="is_active",columnDefinition = "tinynint(1) default 1")
    private Boolean isAcitve;
    @Column(name ="has_pos",columnDefinition = "tinynint(1) default 0")
    private Boolean hasPos;
    @Column(name = "image_url",nullable = true)
    private String  imageUrl;
    @Column(name = "barcode",nullable = true)
    private String  barcode;
    @ManyToOne
    @JoinColumn(name = "product_instance_id")
    private ProductInstance productInstance;
}
