package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		Product pd = new Product();
		pd.setpName("아이스-아메리카노");
		pd.setPrice(4500);
		pd.setBrand("할리스 카페");
		
		pd.information();
	}

}
