package com.example.mikhalevich.services.interfaces;

import com.example.mikhalevich.services.dto.OrderDto;

public interface OrderService {

    OrderDto findOrderById(Integer id);

    void addOrder(OrderDto orderDto);

    void updateOrder(OrderDto orderDto);

    void deleteOrderById(Integer id);
}
