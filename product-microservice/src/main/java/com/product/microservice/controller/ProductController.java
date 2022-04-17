package com.product.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.microservice.dto.model.entity.Product;
import com.product.microservice.service.ProductService;

@RestController
@RequestMapping("/product/v1")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/addProduct")
	ResponseEntity<Product> addProduct(@RequestBody Product product)
	{
		
		return ResponseEntity.status(HttpStatus.CREATED).body(product);
	}

}
