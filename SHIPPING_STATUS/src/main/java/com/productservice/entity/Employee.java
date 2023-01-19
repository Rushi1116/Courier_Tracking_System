package com.productservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;

    @Column(name = "PRODUCT_NAME")
    public String productName;

    @Column(name = "ADDRESS")
    public String address;

    @Column(name = "AGENT_NAME")
    public String agentName;
    
    @Column(name = "STATUS")
    public String status;
}
