package com.sarema.invenotrydo.product.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "product_attribute")
@Data @NoArgsConstructor @AllArgsConstructor
public class ProductAttribute implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "attribute_id")
    private  AttributType attribute;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private  Product product;
    @Column(name = "value",nullable = false)
    @NotBlank
    private  String value;
    @Column(name = "code_color")
    private String codecolor;
}
