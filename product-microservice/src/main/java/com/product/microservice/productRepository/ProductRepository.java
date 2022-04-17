package com.product.microservice.productRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.microservice.dto.model.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
