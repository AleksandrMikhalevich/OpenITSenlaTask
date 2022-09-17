package com.example.mikhalevich.services.dto;

import com.example.mikhalevich.entities.ProductStatus;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link com.example.mikhalevich.entities.Product} entity
 */
@Data
public class ProductDto implements Serializable {
    private final Integer id;
    private final String name;
    private final Integer price;
    private final ProductStatus status;
    private final LocalDate createdAt;
}