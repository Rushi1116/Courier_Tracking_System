package com.productservice.service;

import org.springframework.stereotype.Service;

import com.productservice.model.ProductRequest;
@Service
public interface ProductService {
    String requestproduct(ProductRequest productAdd);

    public String findByProductId(long productId);
    
    String pStatusUpdate(ProductRequest pStatusUpdate);
}
