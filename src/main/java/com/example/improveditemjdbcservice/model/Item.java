package com.example.improveditemjdbcservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Item {
    private String name;
    private Double price;
}
