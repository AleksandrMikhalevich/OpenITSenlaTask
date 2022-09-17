package com.example.mikhalevich.services.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.mikhalevich.entities.Order} entity
 */
@Data
public class OrderDto implements Serializable {
    private final Integer id;
    private final String status;
    private final String createdAt;
    private final Integer userId;
}