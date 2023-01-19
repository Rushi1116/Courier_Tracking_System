package com.productservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productservice.entity.Employee;
import com.productservice.model.ProductRequest;
import com.productservice.repository.ProductRepository;

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
                .agentName(productRequest.getAgentName())
                .status(productRequest.getStatus())
                .build();	//passing parameter values

        productRepository.save(product); //insert query fired

        log.info("Product Created");
        return "Product added to dispatch";
    }

	@Override
	public String findByProductId(long productId) {
		Optional<Employee> optProduct  = productRepository.findById(productId);
		Employee entity = optProduct.get();
		toString();
		return entity.getProductName()+" \n"+entity.getStatus();
	}

	@Override
	public String pStatusUpdate(ProductRequest pStatusUpdate) {
		
	        return "Pending";
	}
}

