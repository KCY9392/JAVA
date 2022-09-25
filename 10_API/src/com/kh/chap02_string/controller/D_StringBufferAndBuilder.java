package com.kh.chap02_string.controller;

public class D_StringBufferAndBuilder {
	
	/*
	 *  String은 불변클래스.
	 *  
	 *  StringBuffer와 StringBuilder는 Mutable(변하는) 클래스
	 *  
	 *  String 클래스는 문자열 연산이 빈번하게 일어나는 알고리즘에서 메모리 이슈가 있어서,
	 *  그것을 해결하기 위해 StringBuilder와 StringBuffer클래스가 나타났다.
	 *  
	 *  StringBuilder와 StringBuffer는 기본적으로 동일한 메소드를 지닌다.
	 *  
	 *  차이점은 '동기화' 유무
	 *  추후 배우게될 'Thread'개념이 적용되어있다.
	 *  
	 *  StringBuffer는 멀티스레드 환경에서 유용하다. -> 실무에서 자주 사용하기때문에 자주사용해라!
	 *  StringBuilder는 단일스레드 환경에서 유용하다.
	 */
	
	public void method() {
		String str = "Hello";
		str += "World";
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("변경 전 sb주소값 : "+System.identityHashCode(sb));
		sb.append("World,");//문자열을 확장하는 메소드 append
		System.out.println("변경 후 sb주소값 : "+System.identityHashCode(sb));// 주소값 동일
		// append 변경 전과 후가 주소값이 동일하다.
		
		
		StringBuilder sb2 = new StringBuilder("Hello");
		System.out.println("변경 전 sb2주소값 : "+System.identityHashCode(sb2));
		sb2.append("World");
		System.out.println("변경 후 sb2주소값 : "+System.identityHashCode(sb2));// 주소값 동일
		// 잘 모르겟음,, 복습 해야댐,,
		
		//유용한 메소드들.
		
		// 내가 원하는 인덱스의 문자를 없애주는 메소드.
		sb.deleteCharAt(sb.length() -1); // 마지막 인덱스값인 , 가 없어지고, 출력됨.
		System.out.println(sb);
		
		// 문자의 마지막 위치를 반환하는 메소드.
		System.out.println("o의 마지막 위치는 ? "+sb.lastIndexOf("o"));
		
		// StringBuilder.delete(int start, int end)
		// 문자열의 start부터 end의 문자까지 삭제시키는 메소드
		sb.delete(0, sb.length()-1);
		System.out.println(sb);
		//0번인덱스부터 마지막 인덱스-1 위치까지 삭제시키고, 마지막 인덱스의 값인 d만 출력함.
		
	}
}
