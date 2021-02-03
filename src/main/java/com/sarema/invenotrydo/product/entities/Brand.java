package com.sarema.invenotrydo.product.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "brands")
@Data @AllArgsConstructor @NoArgsConstructor
public class Brand implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @Column(name = "brand_code",nullable = false)
    private String brandCode;
    @Column(name = "brand_name")
    @NotBlank
    private String brandName;
    @ManyToOne
    @JoinColumn(name = "manufacture_id")
    private Manufacture manufacture;
}
