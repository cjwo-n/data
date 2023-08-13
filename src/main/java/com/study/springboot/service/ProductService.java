package com.study.springboot.service;

import com.study.springboot.data.dto.ProductDto;

public interface ProductService {

	ProductDto saveProduct(String productId, String productName,int productPrice,int productStock);
	
	ProductDto getProduct(String productId);
	
	
}
