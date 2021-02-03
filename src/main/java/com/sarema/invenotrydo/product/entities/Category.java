package com.sarema.invenotrydo.product.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "product_category")
@Data
@AllArgsConstructor @NoArgsConstructor
public class Category implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "category_slug",nullable = false)
    private String slug;
    @Column(name = "category_name")
    @NotNull @NotBlank
    private String categoryName;
    @ManyToOne
    @JoinColumn(name = "category_parent_id",nullable = false)
    private Category categoryParent;
    @Column(name = "content",nullable = false)
    private String content;
}
