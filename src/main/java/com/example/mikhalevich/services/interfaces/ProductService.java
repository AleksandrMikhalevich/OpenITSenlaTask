package com.example.mikhalevich.services.interfaces;

import com.example.mikhalevich.entities.Product;
import com.example.mikhalevich.services.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> findAllProducts();

    ProductDto findProductById(Integer id);

    void addProduct(ProductDto productDto);

    void updateProduct(ProductDto productDto);

    void deleteProductById(Integer id);
}
