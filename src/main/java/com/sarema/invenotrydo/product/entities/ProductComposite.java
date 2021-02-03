package com.sarema.invenotrydo.product.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "product_composite")
@Data @AllArgsConstructor @NoArgsConstructor
public class ProductComposite implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "product_use_id",nullable = false)
    private Product product;
    @ManyToOne
    @JoinColumn(name = "product_instance_composite_id",nullable = false)
    private ProductInstance productInstance;
    @Column(name = "quantity_use",nullable = false)
    @NotNull
    private int qunatityUse;
}
