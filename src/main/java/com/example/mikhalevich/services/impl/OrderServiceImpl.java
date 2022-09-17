package com.example.mikhalevich.services.impl;

import com.example.mikhalevich.repositories.OrderRepository;
import com.example.mikhalevich.services.dto.OrderDto;
import com.example.mikhalevich.services.interfaces.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public OrderDto findOrderById(Integer id) {
        return null;
    }

    @Override
    public void addOrder(OrderDto orderDto) {

    }

    @Override
    public void updateOrder(OrderDto orderDto) {

    }

    @Override
    public void deleteOrderById(Integer id) {

    }
}
