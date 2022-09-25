package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal aArr[] = new Animal [5];
		aArr[0] = new Dog("복돌이","말티즈",5);
		aArr[1] = new Cat("네로","고양이","서울","하양색");
		aArr[2] = new Dog("정콩이","푸들",5);
		aArr[3] = new Cat("하루","고양이","서울","검은색");
		aArr[4] = new Dog("김송이","비숑",7);
		
		for( Animal ani : aArr ) {
			ani.speak();
		}
		//항상 자손객체에 재정의된 메소드를 찾아간다.
	}
}
