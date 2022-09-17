package com.example.mikhalevich.services.mappers;

import com.example.mikhalevich.entities.Product;
import com.example.mikhalevich.services.dto.ProductDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ProductMapper {
    Product productDtoToProduct(ProductDto productDto);

    ProductDto productToProductDto(Product product);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Product updateProductFromProductDto(ProductDto productDto, @MappingTarget Product product);
}
