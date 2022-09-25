package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class Run {

	/*
	 * 컬렉션 (Collection)
	 * : 자료구조가 내장되어있는 클래스로 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크"이다.
	 * 
	 * 자료구조
	 * : 방대한 데이터들을 효율적 (구조적)으로 다룰때 필요한 개념.
	 * 
	 * 프레임워크
	 * : 효율적인 기능들이 이미 정의되어있는 틀.
	 * 
	 * 정리 :
	 * 데이터들이 새로이 추가되거나, 삭제가 되거나 수정이 되는 기능(알고리즘활용)들이 이미 정의되어있는 틀이 Collection이다.
	 * => 대량의 데이터들을 관리하고자 할 때 배열 가지고 충분히 사용했었음. 
	 * 단, 이 배열의 단점(크기 지정하면 못 바꿈)을 보완한 것이 컬렉션.
	 * 
	 * 배열과 컬렉션의 차이점
	 * 
	 *  - 배열의 단점
	 *  1. 배열을 쓰고자 할때, 먼저 크기를 지정해야함.
	 *  	=> 한번 지정된 크기는 변경이 불가능함.
	 *  	   새로운 값을 추가하고자 할 때, 크기가 오버될 경우, 새로운 크기의 배열을 만들고, 기존의 내용들을 복사해주는 코드를 직접 짜야함.
	 *  2. 배열 중간에 새로운 데이터를 추가하거나, 삭제하는 경우, 기존의 값들을 땡겨주는 코드를 직접 짜야함.
	 *  3. 한 타입의 데이터만 저장가능.
	 *  
	 *  - 컬렉션의 장점.
	 *  1. 크기에 제약이 없다.
	 *  	=> 크기지정을 해줄 필요도 없고, 만일 크기 지정을 해도 알아서 크기가 늘어나면서 새로운 데이터를 추가해주는 코드가 이미 정의되어있다.
	 *  2. 중간에 값을 추가하거나 삭제하는 경우, 값을 땡겨주는 코드가 이미 메소드로 정의되어있다.
	 *  3. 기본적으로 여러타입의 데이터를 저장할 수 있다.(단, 제네릭 설정을 통해서 한 타입의 데이터들만 들어올 수 있게끔도 가능.)
	 *  
	 *  방대한 데이터를 단지 담아만 두고 조회할 경우 => 배열 사용.
	 *  방대한 데이터를 빈번하게 추가, 삭제, 수정할 경우 => 컬렉션.
	 *  
	 * 
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Music> list = new ArrayList<Music>();
		//제네릭 설정 : 리스트배열에 Music객체 타입 값만 받아들이게함.
		
//		System.out.println(list);	//안에 아무것도 없는 상태 []
		
		// 1. add(E e) : 해당 리스트의 끝에 전달된 e를 추가시켜주는 메소드.
		list.add(new Music("Out of time","the weekend"));
		list.add(new Music("Attention","new jeans"));
		list.add(new Music("Heat waves","unknown"));
		//list.add("여기까지.");
		
		System.out.println(list);
		
		//리스트 특징
		// - 순서가 유지되면서 값이 추가된다. 
		// - 크기에 제약이 없다. 
		// - 다양한 타입의 값이 추가 가능하다.
		

		// 2. add(int index, E e) : 리스트에 전달되는 index 값 위치에 전달되는 e값을 추가시켜주는 메소드.
		list.add(1, new Music("Black mamba","espa"));
		// 중간에 값 추가시 알아서 기존의 값들을 뒤로 땡겨주는 작업이 내부적으로 진행된다.
		System.out.println(list);
		
		// 3. set(int index, E e) : 리스트에 해당 인덱스의 값을 전달되는 e로 변경시켜주는 메소드.
		list.set(3, new Music("ashes","stellar"));
		// 값을 변경시켜줌.
		System.out.println(list);
		
		
		// 4. remove(int index) : 리스트에 해당 인덱스의 값을 삭제시켜주는 메소드
		list.remove(3);
		// 값을 삭제시키고 알아서 크기가 줄어들음.
		System.out.println(list);
		
		
		// 5. size() : 리스트에 담겨있는 데이터의 수를 반환해주는 메소드.
		System.out.println("리스트에 담긴 데이터의 수 : "+list.size());
		System.out.println("리스트에 마지막 인덱스는 ? "+(list.size()-1));
		
		// 6. get(int index) : E => 리스트에 해당 index위치의 데이터를 반환해주는 메소드.
		//Music m = (Music)list.get(3);//문자열을 Music타입으로 강제형변환하려고해서 에러발생.
		
		//제네릭 적용 후, 강제형변환 하지않아도 에러나지 않음.
		Music m = list.get(0);
		System.out.println(m);
		System.out.println(list.get(1));
		
		System.out.println(m.getTitle());
		System.out.println(list.get(1).getTitle());
		
		System.out.println("=================================================");
		
		//0번 인덱스부터 배열의 끝까지 반복하는 반복문.
		//for문
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getTitle());
		}
		
		System.out.println("=================================================");

		//향상된 for문
		for( Music u :  list) {
			System.out.println(((Music)u).getTitle());
		}
		
		System.out.println("=================================================");

		// 7. subList(int index1, int index2) :
		//    해당리스트로부터 index1에서부터 index2"전"까지의 데이터값을 추출해서,
		//    새로운 List로 반환시켜주는 메소드.
		List<Music> sub = list.subList(0, 2);
		// 0 <= 추출할 인덱스 범위  < 2
		System.out.println(sub);
		
		System.out.println("=================================================");

		// 매우 많이 사용!!
		// 8. addAll(Collection c) : 
		//    해당리스트에 다른 컬렉션에 있는 데이터들을 통째로 "추가"해주는 메소드.
		list.addAll(sub);
		System.out.println(list);
		
		System.out.println("=================================================");

		// 9. isEmpty() : 해당리스트가 비어있는 지 묻는 메소드.(비어있으면 true, 아니면 false반환)
		System.out.println("리스트가 비어있습니까? : "+list.isEmpty());
		//list.get(0);

		System.out.println("=================================================");

		// 10. clear() : 해당 리스트를 싹 비워주는 메소드.
		list.clear();
		System.out.println(list);
		System.out.println("리스트가 비어있습니까? : "+list.isEmpty());
		
	}
}
