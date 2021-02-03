package com.sarema.invenotrydo.product.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "prodcut_uom_convert")
@Data @NoArgsConstructor @AllArgsConstructor
public class ProductUomConvert implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "from_uom_id")
    private ProductUOM fromUOM;
    @ManyToOne
    @JoinColumn(name = "to_uom_id")
    private ProductUOM toUOM;
    @Column(name = "convert_value")
    @NotNull
    private int convertValue;
}
