package com.sarema.invenotrydo.product.entities;

import com.sarema.invenotrydo.product.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
@Entity
@Table(name = "inventory")
@Data @NoArgsConstructor @AllArgsConstructor
public class Inventory implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @Column(name = "inventory_code")
    @NotBlank
    private String inventoryCode;
    @Column(name = "raison")
    @NotBlank
    private String raison;
    @Column(name = "describe")
    private String describe;
    @Column(name = "status",nullable = false)
    @NotBlank
    private Status status;
}
