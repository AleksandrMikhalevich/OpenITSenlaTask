package com.example.mikhalevich.services.interfaces;

import com.example.mikhalevich.services.dto.ProductDto;

public interface ProductService {

    ProductDto findProductById(Integer id);

    void addProduct(ProductDto productDto);

    void updateProduct(ProductDto productDto);

    void deleteProductById(Integer id);
}
