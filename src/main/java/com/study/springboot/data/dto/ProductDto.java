package com.study.springboot.data.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.study.springboot.data.entity.ProductEntity;

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

	@NotNull
	private String productId;	//상품 코드
	
	@NotNull
	private String productName;	//상품명
	
	@NotNull
	@Min(value = 500)
	@Max(value = 3000000)
	private int productPrice;	//상품 가격
	
	@NotNull
	@Min(value = 8)
	@Max(value = 9999)
	private int productStock;	//상품 제고
	
	//어떤 데이터를 받고 넘길 것이냐가 고려해서 설계해야됨
	public ProductEntity toEntity() {
		return ProductEntity.builder()
				.productId(productId)
				.productName(productName)
				.productPrice(productPrice)
				.productStock(productStock)
				.build();
	}
}
//유효성 검증 (Validation)
//@NotNull : 해당 값에 Null을 허용하지 않음
//@NotBlank : Null을 허용하지 않으며 문자가 한 개 이상 포함되어야 함 (공백 제외)
//@NotEmpty : Null을 허용하지 않으며 공백 문자열을 허용하지 않음
//@AssertTrue : true인지 확인
//@Min : 값이 Min보다 작은지 확인 
//@Max : 값이 Max보다 큰지 확인
//@Size : 값이 min과 max사이에 해당하는지 확인 (CharSequence, Collection, Map, Array에 해당)