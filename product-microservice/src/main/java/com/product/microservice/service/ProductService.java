package com.product.microservice.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import com.product.microservice.entity.Product;
import com.product.microservice.productRepository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public Product saveProduct(Product product) {
		
		return productRepository.save(product);
	}

	public List<Product> products() {

		return productRepository.findAll();
	}

	public Product createOrUpdateProduct(Product product) {
		
		return productRepository.save(product);
	}

	public Map<String, Boolean> deleteProduct(int id) {
	
		Product product = productRepository.getById(id);
		productRepository.delete(product);
		
		Map<String, Boolean> Response = new HashMap<> ();
		Response.put("Deleted", Boolean.TRUE);
		return Response;
	} 

}
