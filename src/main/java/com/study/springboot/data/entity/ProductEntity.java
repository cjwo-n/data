package com.study.springboot.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor 대신@Data를 사용가능(하지만 쫌 느려짐)

@Builder
@Table(name = "product")
public class ProductEntity {

	@Id //@Id이 붙은 쪽에 pk값이 설정이된다
	String productId;
	
	String productName;
	
	Integer productPrice;
	
	Integer productStock;
}
