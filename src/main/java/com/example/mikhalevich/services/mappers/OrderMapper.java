package com.example.mikhalevich.services.mappers;

import com.example.mikhalevich.entities.Order;
import com.example.mikhalevich.services.dto.OrderDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OrderMapper {
    @Mapping(source = "userId", target = "user.id")
    Order orderDtoToOrder(OrderDto orderDto);

    @Mapping(source = "user.id", target = "userId")
    OrderDto orderToOrderDto(Order order);

    @Mapping(source = "userId", target = "user.id")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Order updateOrderFromOrderDto(OrderDto orderDto, @MappingTarget Order order);
}
