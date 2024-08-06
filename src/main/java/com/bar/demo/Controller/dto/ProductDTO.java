package com.bar.demo.Controller.dto;

import com.bar.demo.entity.Maker;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter

public class ProductDTO {

    private Long id;
    private String name;
    private BigDecimal price;
    private Integer stock;
    private Maker maker;


}
