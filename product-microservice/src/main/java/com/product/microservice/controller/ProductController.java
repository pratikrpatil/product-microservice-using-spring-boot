package com.product.microservice.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.microservice.entity.Product;
import com.product.microservice.service.ProductService;

@RestController
@RequestMapping("/productMicroservice/v1")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> products()
	{
		return productService.products();
	}
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
		return productService.saveProduct(product);
	}
	
	@PutMapping("/createOrUpdateProduct")
	public Product createOrUpdateProduct(@RequestBody Product product)
	{
		return productService.createOrUpdateProduct(product);
	}
	
	@DeleteMapping("/deleteProduct")
	public Map<String, Boolean> deleteProduct(@RequestParam int id)
	{
		return productService.deleteProduct(id);
	}

}
