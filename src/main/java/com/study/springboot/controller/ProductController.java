package com.study.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.study.springboot.data.dto.ProductDto;

public class ProductController {

	private ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	//http://localhost:8080
	@GetMapping(value = "/product/{productId}")
	public ProductDto getProduct(@PathVariable String productId) {
		return productService.getProduct(productId);
	}
}
