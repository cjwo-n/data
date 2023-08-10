package com.study.springboot.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.springboot.data.entity.ProductEntity;

//ProductEntity: 엔티티(Entity) 타입
//String: 엔티티의 식별자(Id) 타입
public interface ProductRepository extends JpaRepository<ProductEntity, String> {

}
