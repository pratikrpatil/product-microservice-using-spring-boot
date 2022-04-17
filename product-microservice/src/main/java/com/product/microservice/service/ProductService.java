package com.product.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.microservice.dto.model.entity.Product;
import com.product.microservice.productRepository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public Product saveProduct(Product product) {
		
		return productRepository.save(product);
	} 

}
