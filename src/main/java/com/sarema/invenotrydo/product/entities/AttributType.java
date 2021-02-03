package com.sarema.invenotrydo.product.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
@Entity
@Table(name = "product_attribut_type")
public class AttributType implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @Column(name = "attribute_name",nullable = false)
    @NotBlank
    private String attributeName;
}
