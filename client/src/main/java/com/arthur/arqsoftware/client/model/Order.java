package com.arthur.arqsoftware.client.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private long totalValue;
    private LocalDateTime date;
    private List<Item> items;
}
