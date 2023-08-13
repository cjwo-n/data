package com.study.springboot.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.springboot.data.entity.ProductEntity;

//ProductEntity:레퍼지토리가 사용할 엔티티(Entity) 타입 
//String: 엔티티애서 사용할 pk,즉 식별자(Id) 타입을 찾는다는 의미
public interface ProductRepository extends JpaRepository<ProductEntity, String> {

}
