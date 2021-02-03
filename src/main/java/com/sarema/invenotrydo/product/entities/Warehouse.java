package com.sarema.invenotrydo.product.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class Warehouse implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "warehouse_name",nullable = false)
    @NotBlank
    private String name;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "country")
    private String country;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    @Email
    private String email;
    @Column(name = "has_primary",columnDefinition = "tinint(1) default 0")
    private Boolean hasPrimary;
    @Column(name = "has_actived",columnDefinition = "tinint(1) default 1")
    private Boolean hasActived;
}
