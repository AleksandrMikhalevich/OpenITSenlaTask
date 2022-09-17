package com.example.mikhalevich.controller;

import com.example.mikhalevich.services.dto.ProductDto;
import com.example.mikhalevich.services.interfaces.OrderService;
import com.example.mikhalevich.services.interfaces.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequiredArgsConstructor
public class ShopController {

    private final OrderService orderService;
    private final ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<ProductDto>> getAllProducts() {
        List<ProductDto> listProducts = productService.findAllProducts();
        if (listProducts.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(listProducts);
    }

    @GetMapping("/products/{id}")
    public  ResponseEntity<ProductDto> findProduct(@PathVariable Integer id) {
        ProductDto productDto = productService.findProductById(id);        ;
        if (productDto != null) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(NOT_FOUND).build();
        }
    }
}
