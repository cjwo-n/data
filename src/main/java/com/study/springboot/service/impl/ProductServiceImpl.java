package com.study.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.data.dto.ProductDto;
import com.study.springboot.data.entity.ProductEntity;
import com.study.springboot.handler.ProductDataHandler;
import com.study.springboot.service.ProductService;

@Service
//서비스의 구현체(본체)
public class ProductServiceImpl implements ProductService {

	//데이터를 헨들링 할 작업 필요하냐 아니냐를 구분하는 옵션
	ProductDataHandler productDataHandler;
	
	@Autowired
	public ProductServiceImpl(ProductDataHandler productDataHandler) {
		this.productDataHandler = productDataHandler;
		
	}
	
	@Override
	public ProductDto saveProduct(String productId, String productName, int productPrice, int productStock) {
		ProductEntity productEntity = productDataHandler.saveProductEntity(productId, productName, productPrice, productStock);
		
		ProductDto productDto = new ProductDto(
				productEntity.getProductId(),productEntity.getProductName(),productEntity.getProductPrice(),productEntity.getProductStock());
		
		return productDto;
	}
	
	@Override
	public ProductDto getProduct(String productId) {
		ProductEntity productEntity = productDataHandler.getProductEntity(productId);
		
		ProductDto productDto = new ProductDto(
				productEntity.getProductId(),productEntity.getProductName(),productEntity.getProductPrice(),productEntity.getProductStock());
		
		return productDto;
	}
}
