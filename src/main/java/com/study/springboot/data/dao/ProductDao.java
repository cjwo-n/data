package com.study.springboot.data.dao;

import com.study.springboot.data.entity.ProductEntity;

public interface ProductDao {
	//상품 저장
	ProductEntity saveProduct(ProductEntity productEntity);
	
	//상품 조회
	ProductEntity getProduct(String productId);
	
	//인터페이스에는 많은 로직이 들어가지 않기에 거의 대부분 선언만 해주먄된다
}
