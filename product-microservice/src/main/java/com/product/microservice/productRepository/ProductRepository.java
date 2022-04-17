package com.product.microservice.productRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.microservice.dto.model.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
