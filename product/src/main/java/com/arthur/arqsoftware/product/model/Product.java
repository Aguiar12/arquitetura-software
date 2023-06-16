package com.arthur.arqsoftware.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@Data
@With
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String id;
    private long value;
    private String name;
    private String description;
    private String imageUrl;
}
