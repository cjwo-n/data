package com.study.springboot.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {

	private String productId;	//상품 코드
	private String productName;	//상품명
	private int productPrice;	//상품 가격
	private int productStock;	//상품 제고
	
	//어떤 데이터를 받고 넘길 것이냐가 고려해서 설계해야됨
}
