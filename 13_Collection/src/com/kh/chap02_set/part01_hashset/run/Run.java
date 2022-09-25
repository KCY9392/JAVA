package com.kh.chap02_set.part01_hashset.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashset.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		//HashSet hs1 = new HashSet();
		// 노란 불 들어옴. 제네릭이 필요하다.
		
		HashSet<String> hs1 = new HashSet<String>();

		
		// 1. 값 추가 : add(추가할 값)
		hs1.add("반갑습니다."); //상수 Pool에 있는 값
		hs1.add("반갑습니다."); //상수 Pool에 있는 값 //둘다 동일한 주소값
		hs1.add(new String("반갑습니다.")); // 동일한 주소값 피하기 위해 직접 생성자로 생성한 String
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분")); //앞의 여러분과 주소값 완전 다름.
		
		//hs1.add(50); //숫자도 들어감.
		// 제네릭이 추가되서 빨간불이 들어옴.
		
		System.out.println(hs1);
		//[50, 안녕하세요, 여러분, 반갑습니다.] -> 배열의 형태
		// 순서가 이상하고, 중복문자열은 한번밖에 출력안됨.
		// 저장 순서유지X, 중복저장X
		
		
		// 2. 크기 구하기 : size()
		System.out.println(hs1.size()); // 4
		
		
		// 3. 값 삭제 : remove(삭제할 값)
		hs1.remove("여러분");
		System.out.println(hs1);
		//[50, 안녕하세요, 반갑습니다.] -> 여러분이 삭제됨.
		// 저장순서가 유지가 안되기때문에, 값 그 자체를 대입해서 삭제시킨다.
		
		
		// 4. 모든 값을 삭제 : clear();
		hs1.clear();
		System.out.println(hs1); //[] -> 텅 비어있는 hashSet출력됨.
		
		
		System.out.println("-------------------------------");
		
		
		HashSet<Student> hs2 = new HashSet<Student>();
		
		hs2.add(new Student("김채영",23,80));
		hs2.add(new Student("김채영2",24,98));
		hs2.add(new Student("김채영3",25,100));
		hs2.add(new Student("김채영",23,80)); //처음 넣은 값과 똑같은 학생 추가해봄.
		
		Student std = new Student("김채영",23,80);
		Student std2 = new Student("김채영",23,80);
		
		System.out.println(hs2);
		System.out.println("std와 std2는 같은가? "+std.equals(std2)); //false
		System.out.println("std의 해쉬코드 : "+std.hashCode());
		System.out.println("std2의 해쉬코드 : "+std2.hashCode()); 
		//hashCode() 를 정의하기 전에는 두 std, std2의 해쉬코드는 다름.
		//Student클래스에서 재정의한 후는 해쉬코드 값이 동일하다.
		
		//원래 hashSet 특징 : 저장순서 유지X, 중복저장X 
		//[Student [name=김채영, age=23, score=80], Student [name=김채영, age=23, score=80],
		// -> 근데 중복저장이 됨.
		//55번줄이랑 58번줄의 객체가 동일한 값이라고 판단하지 못해서 중복저장이 되서 출력됨.
		//판단할 기준이 없어서 그럼.
		
	// 값이 추가될때, equals() , hashcode()로 비교한 후, true면 동일한 객체로 판단한다.
		
		// HashSet 에 객체를 담을 때 내부적으로 equals()로 비교 + hashCode()값이 일치하는 지도 비교.
		// equals()한 결과가 true이고, hashCode()값이 일치한다면, 동일객체로 판단(중복저장불가)
		
		// Object 클래스에 있는 equals() : 두 객체의 주소값을 가지고 비교해서 일치하면 true / 일치하지않으면 false
		// Object 클래스에 있는 hashCode() : 두 객체의 주소값을 기반으로 해서 해시코드값 만들어서 변환하여 비교.
		
		// 객체의 각 필드값이 일치하면 동일한 객체로 판단이 되서 중복저장이 안되게끔 하고싶으면 오버라이딩을 해줘야함.
		
		// Student 클래스에 equals() 오버라이딩 : 새 필드값이 일치하면 true / 하나라도 일치하지 않으면 false
		// Student 클래스에 hashCode() 오버라이딩 : 새 필드값 기반으로 해서 해시코드값을 만들어서 반환.
		
		
		System.out.println("-------------------------------------------");
		
		// set => 무작위로 객체가 저장되어있음. => index 개념이 없음. => 반복문 활용 불가능.
		// 그렇다면, 담겨있는 객체를 순차적으로 접근하고자 할때 ? 
		
		// 1. for문 활용. (단, 향상된 for문만 활용 가능)
		for( Student s : hs2 ) {
			System.out.println(s);
		}
		
		
		System.out.println("-------------------------------------------");

		// 2. ArrayList 활용.
		//ArrayList<Student> list = new ArrayList<Student>();
		//list.addAll(hs2); // hashSet객체들을 다 list에 넣어줌.
		
		ArrayList<Student> list = new ArrayList<Student>(hs2);
		//생성과 동시에 hs2로 초기화
		// hs2에 담겨있는 객체들이 추가된 채로 리스트가 생성된다.
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 결과 위와 동일
		
		
		System.out.println("-------------------------------------------");
		// 중복된 값을 비울때만 많이 사용함.
		
		// 3. HashSet클래스에서 제공하는 Iterator 반복자를 이용한 방법.
		// Iterator : 반복자
		// hs2에 담겨있는 객체들을 Iterator에 담는 과정.
		
		Iterator<Student> it = hs2.iterator(); // 자료형이 Iterator로 동일
		
		while(it.hasNext()) { // it에 next로 빼올 값이 남아있으면 true/없으면 false
			System.out.println(it.next());
			// StringTokenizer와 비슷한 원리.
		}
		//.iterator() : List계열과 set계열에서만 사용가능한 메소드.
		// (Map계열에서는 사용 불가)
		
	}

}
