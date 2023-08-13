package com.study.springboot.handler;

import com.study.springboot.data.entity.ProductEntity;

public interface ProductDataHandler {

	ProductEntity saveProductEntity(String productId, String productName,
			int productPrice, int productStock);
	
	ProductEntity getProductEntity(String productId);
}
