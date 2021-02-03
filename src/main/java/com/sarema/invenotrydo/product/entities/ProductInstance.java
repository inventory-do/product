package com.sarema.invenotrydo.product.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "product_instance")
@NoArgsConstructor @AllArgsConstructor
@Data
public class ProductInstance implements Serializable {
    @Id @GeneratedValue
    private String id;
    @Column(name = "product_name",nullable = false)
    @NotBlank
    private String productName;
    @Column(name = "remark")
    private String remark;
    @Column(name = "image_url",nullable = false)
    private String imageUrl;
    @Column(name = "has_attribute")
    private Boolean hasAttribute;
    @Column(name = "has_composite")
    private Boolean hasComposite;
    @Column(name = "supplier_ref")
    private String supplierRef;
    @ManyToOne
    @JoinColumn(name = "product_uom_id",nullable = false)
    private ProductUOM productUOM;
    @ManyToOne
    @JoinColumn(name = "category_product_id",nullable = false)
    private Category category;
    @ManyToOne
    @JoinColumn(name = "brand_product_id",nullable = false)
    private Brand brand;
   /* @OneToMany(mappedBy = "product_instance_id")
    private List<Product> products;*/
}
