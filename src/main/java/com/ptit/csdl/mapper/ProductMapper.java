package com.ptit.csdl.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.ptit.csdl.dto.request.creation.ProductCreationRequest;
import com.ptit.csdl.dto.response.ProductResponse;
import com.ptit.csdl.entity.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(source = "supplier.id", target = "supplierId")
    @Mapping(source = "supplier.supplierName", target = "supplierName")
    public ProductResponse toResponse(Product product);
    public Product toProduct(ProductCreationRequest request);
    public List<ProductResponse> toResponse(List<Product> order);
    public void updateProduct(@MappingTarget Product product, ProductCreationRequest request);
}
