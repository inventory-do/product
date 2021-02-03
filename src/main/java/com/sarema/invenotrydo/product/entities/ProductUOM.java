package com.sarema.invenotrydo.product.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "product_uom")
@AllArgsConstructor @NoArgsConstructor
public class ProductUOM implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @Column(name = "name")
    @NotBlank
    private String name;
    @Column(name = "libelle",nullable = false)
    private String libelle;
}
