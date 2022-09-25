package com.kh.example.practice5.model.vo;

public class Lotto {
	
	public int [] lotto = new int [6];
	
	public Lotto() {}
	
	public void setLotto() {
		for (int i = 0; i < lotto.length; i++) {
			int num = (int) (Math.random() * 45 + 1);
			if (i > 0) {
				for (int j = 0; j < i; j++) {
					if (num == lotto[j]) {
						i--;
						break;
					}
					lotto[i] = num;
				}
			}else {
				lotto[i] = num;
			}
		}
	}
	
	public int getLotto(int lotto) {
		return lotto;
	}
	
	public void information() {
		for(int i=0; i< lotto.length; i++) {
			System.out.printf("lotto[%d] = %d\n",i,lotto[i]);
			}
	}
}
