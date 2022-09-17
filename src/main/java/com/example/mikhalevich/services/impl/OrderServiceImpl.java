package com.example.mikhalevich.services.impl;

import com.example.mikhalevich.repositories.OrderRepository;
import com.example.mikhalevich.services.dto.OrderDto;
import com.example.mikhalevich.services.interfaces.OrderService;
import com.example.mikhalevich.services.mappers.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Override
    public OrderDto findOrderById(Integer id) {
        return orderRepository.findById(id).map(orderMapper::orderToOrderDto).orElse(null);
    }

    @Override
    public void addOrder(OrderDto orderDto) {
        orderRepository.save(orderMapper.orderDtoToOrder(orderDto));
    }

    @Override
    public void updateOrder(OrderDto orderDto) {
        orderRepository.save(orderMapper.orderDtoToOrder(orderDto));
    }

    @Override
    public void deleteOrderById(Integer id) {
        orderRepository.deleteById(id);
    }
}
