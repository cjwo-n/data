package com.study.springboot.handler.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.springboot.data.dao.ProductDao;
import com.study.springboot.data.entity.ProductEntity;
import com.study.springboot.handler.ProductDataHandler;

@Service
@Transactional
public class ProductDataHandlerImpl implements ProductDataHandler {

	ProductDao productDao;
	
	@Autowired
	public ProductDataHandlerImpl(ProductDao productDao) {
		this.productDao= productDao;
	}
	
	@Override
	public ProductEntity saveProductEntity(
			String productId, String productName, int productPrice, int productStock) {
		ProductEntity productEntity= new ProductEntity(productId, productName, productPrice, productStock);
		
		return productDao.saveProduct(productEntity);
	}
	@Override
	public ProductEntity getProductEntity(String productId) {
		return productDao.getProduct(productId);
	}
}
