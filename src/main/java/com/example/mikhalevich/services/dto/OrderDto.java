package com.example.mikhalevich.services.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * A DTO for the {@link com.example.mikhalevich.entities.Order} entity
 */
@Data
public class OrderDto implements Serializable {
    private final Integer id;
    private final String status;
    private final String createdAt;
    private final Set<ProductDto> products;
    private final Integer userId;
}