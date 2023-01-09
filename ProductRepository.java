package com.dailycodebuffer.ProductService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.ProductService.entity.Employee;

@Repository
public interface ProductRepository extends JpaRepository<Employee,Long> {
}
