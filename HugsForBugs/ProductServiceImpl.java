package com.dailycodebuffer.ProductService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.ProductService.entity.Employee;
import com.dailycodebuffer.ProductService.model.ProductRequest;
import com.dailycodebuffer.ProductService.repository.ProductRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public String requestproduct(ProductRequest productRequest) {
       log.info("Adding Product..");

        Employee product
                = Employee.builder()
                .productName(productRequest.getProductName())
                .address(productRequest.getAddress())
                .AgentName(productRequest.getAGENT_NAME())
                .build();

        productRepository.save(product);

        log.info("Product Created");
        return product.getProductName();
    }

  
    }

