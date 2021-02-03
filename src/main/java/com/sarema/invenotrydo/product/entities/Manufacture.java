package com.sarema.invenotrydo.product.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "manufacture")
@AllArgsConstructor @NoArgsConstructor
@Data
public class Manufacture implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @Column(name = "name")
    @NotBlank
    private String name;
}
