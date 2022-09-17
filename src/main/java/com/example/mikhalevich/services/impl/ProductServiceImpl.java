package com.example.mikhalevich.services.impl;

import com.example.mikhalevich.repositories.ProductRepository;
import com.example.mikhalevich.services.dto.ProductDto;
import com.example.mikhalevich.services.interfaces.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public ProductDto findProductById(Integer id) {
        return null;
    }

    @Override
    public void addProduct(ProductDto productDto) {

    }

    @Override
    public void updateProduct(ProductDto productDto) {

    }

    @Override
    public void deleteProductById(Integer id) {

    }
}
