package com.kh.chap02;

import java.util.function.*;

import com.kh.lamda.Product;

public class SupplierTest {

	/*
	 * Supplier 인터페이스 특징
	 * 1. 주로 생산자 역할을 띈 함수를 작성할때 사용
	 * 2. 매개값 없고 리턴값은 있음.
	 * 3. 내부적으로 getXXX()메소드 존재한다
	 */
	
	// 1) Supplier<T> : T형 반환시켜준다
	static Supplier<Product> supplier = () -> { return new Product("갤럭시 z플립4", 1000000, 100);};
	
	
	// 2) xxxSuplier : xxx형 반환
	static BooleanSupplier isTrue = () -> false;
	
	public static void main(String[] args) {
		System.out.println(supplier.get().getpName());

		System.out.println("z플립4 살 가치가 있습니까? "+isTrue.getAsBoolean());
		
		
	}
	
}
