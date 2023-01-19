package com.productservice.model;

import lombok.Data;

@Data
public class ProductRequest {
    private String productName;
    private String address;
    private String agentName;
    private String status;   
}
