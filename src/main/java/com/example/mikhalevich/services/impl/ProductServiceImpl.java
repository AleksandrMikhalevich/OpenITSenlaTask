package com.example.mikhalevich.services.impl;

import com.example.mikhalevich.entities.Product;
import com.example.mikhalevich.repositories.ProductRepository;
import com.example.mikhalevich.services.dto.ProductDto;
import com.example.mikhalevich.services.interfaces.ProductService;
import com.example.mikhalevich.services.mappers.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    @Override
    public List<ProductDto> findAllProducts() {
        return productRepository.findAllProducts(JpaSort.unsafe("orders")).stream()
                .map(productMapper::productToProductDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto findProductById(Integer id) {
        return productRepository.findById(id).map(productMapper ::productToProductDto).orElse(null);
    }

    @Override
    public void addProduct(ProductDto productDto) {
        productRepository.save(productMapper.productDtoToProduct(productDto));

    }

    @Override
    public void updateProduct(ProductDto productDto) {
        productRepository.save(productMapper.productDtoToProduct(productDto));
    }

    @Override
    public void deleteProductById(Integer id) {
        productRepository.deleteById(id);
    }
}
