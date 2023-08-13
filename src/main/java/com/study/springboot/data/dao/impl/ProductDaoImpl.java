package com.study.springboot.data.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.data.dao.ProductDao;
import com.study.springboot.data.entity.ProductEntity;
import com.study.springboot.data.repository.ProductRepository;

@Service
public class ProductDaoImpl implements ProductDao{
	
	//미리 레퍼지토리라는 객체를 빈으로 띄우고 이 하나 객체를 여러곳에서 사용하는 방식이 부트이다?
	ProductRepository productRepository;
	
	@Autowired
	//자동으로 연결, 즉 의존성 주입
	public ProductDaoImpl(ProductRepository productRepository) {
		this.productRepository= productRepository;
	}
	
	@Override
	//override 어노테이션을 이용해 
	//ProductDao에 있는 ProductEntity saveProduct, ProductEntity getProduct에 값을 가져와
	
	public ProductEntity saveProduct(ProductEntity productEntity) {
		productRepository.save(productEntity);
		return productEntity;
		
	}
	@Override
	public ProductEntity getProduct(String productId) {
		ProductEntity productEntity = productRepository.getById(productId);
		return productEntity;
		
	}
}
