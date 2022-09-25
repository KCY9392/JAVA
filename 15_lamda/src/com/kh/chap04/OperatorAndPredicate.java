package com.kh.chap04;

import java.util.ArrayList;
import java.util.function.*;

import com.kh.lamda.Product;

public class OperatorAndPredicate {

	/*
	 * Operator 인터페이스 특징
	 * 1. 단순연산 시, 사용하는 람다식이다.
	 * 2. 받아온 타입 혹은 인자를 통해 계산을 하고, 해당 타입을 그대로 반환한다.
	 */
	
	/*
	 * Predicate 인터페이스 특징
	 * 1. 매개변수로 넘어온 값을 검증할때 사용하는 람다식이다.
	 * 2. 받아온 타입을 확인하고, boolean값을 반환한다.
	 */
	
	
	public static void main(String[] args) {
		
		// 1) Predicate<T> : T형을 인자로 받아서 true, false값을 반환시켜준다.
		// Product클래스를 인자로 받고, 재고가 있으면 true, 없으면 false 반환한다.
		Predicate<Product> checkStock = product -> product.getStock() > 0 ;
		
		//핸드폰 객체 배열 리스트를 만들기
		ArrayList<Product> pList = new ArrayList<Product>();
		pList.add(new Product("갤럭시 z플립4", 1350000,55));
		pList.add(new Product("갤럭시 z플립3", 1000000,25));
		pList.add(new Product("갤럭시 z플립2", 1800000,80));
		pList.add(new Product("갤럭시 z플립1", 1400000,15));
		pList.add(new Product("아이폰 14", 2000000,0));

		for( Product p : pList ) {
			if(checkStock.test(p)) {
				System.out.println(p.getpName()+"상품은 현재 재고가 있습니다.");
			}else {
				System.out.println(p.getpName()+"상품은 현재 재고가 없습니다.");
			}
		}
	}

}
