package com.study.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.springboot.data.dto.ProductDto;
import com.study.springboot.service.ProductService;

@RestController
@RequestMapping("/api/v1/product-api")
public class ProductController {

	private ProductService productService;
	
	@Autowired
	//자동 의존성 주입
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	//http://localhost:8080/api/v1/product-api/product/{productId}
	@GetMapping(value = "/product/{productId}")
	public ProductDto getProduct(@PathVariable String productId) {
		return productService.getProduct(productId);
	}
	@PostMapping(value = "/product")
	public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto) {
		
		//dto는 각 계층간에 데이터를 옮기는 역할
		
//		if(productDto.getProductId().equals("")|| productDto.getProductId().isEmpty()) {
//			LOGGER.error()
//		}
			String productId = productDto.getProductId();
			
			String productName = productDto.getProductName();
			int productPrice = productDto.getProductPrice();	
			int productStock = productDto.getProductStock();
			
			ProductDto response = productService
					.saveProduct(productId, productName, productPrice, productStock);
			
			//return productService.saveProduct(productId,productName,productPrice, productStock);
			return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
