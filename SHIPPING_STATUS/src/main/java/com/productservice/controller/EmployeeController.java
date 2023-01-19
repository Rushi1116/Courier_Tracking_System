package com.productservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productservice.entity.Employee;
import com.productservice.model.ProductRequest;
import com.productservice.repository.ProductRepository;
import com.productservice.service.ProductService;


@RestController
@RequestMapping("/Employee")
public class EmployeeController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;
   
    @PostMapping("/addProduct")		//Add Product 
    public String addProduct(@RequestBody ProductRequest productRequest) {
        String addProduct = productService.requestproduct(productRequest);
        return  addProduct;
    }
    @GetMapping("/findAllProduct")
    public List<Employee> getAllProduct() {	//view all product list
        System.out.println("viewed all products");
        return productRepository.findAll();
    }
    @GetMapping("/{pid}")	//view status of product
    public String getProductStatus(@PathVariable("pid") long pid){
    	return productService.findByProductId(pid);
    }
    
    

   

    
}
