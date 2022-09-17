package com.example.mikhalevich.controller;

import com.example.mikhalevich.services.interfaces.OrderService;
import com.example.mikhalevich.services.interfaces.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ShopController {

    private final OrderService orderService;
    private final ProductService productService;

}
