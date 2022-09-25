package com.kh.variable;

public class A_Variable {
	//변수의 필요성 알아보기
	//시급과 근무시간, 근무일수를 곱해서 월급을 계산하는 프로그램.
	
	public void printVariable() {
		
		//변수 사용전
		System.out.println("시급 : 9180원");
		System.out.println("근무시간 : 6시간");
		System.out.println("근무일수 : 20일");
		
		//월급 = 시급 X 근무시간 X 근무일수
		//김채영의 월급은 000000000원형식으로 출력.
		//자바에서 곱셈은 *를 사용합니다.
		//정수와 정수사이의 +은 숫자 더하기 역할
		//문자열과 문자열사이의 +는 문자열을 연결하는 역할
		
		System.out.println("나비스의 월급은 " +(9180*6*20)+ "원 입니다.");
		//()은 제일 먼저 계산하는 키워드
		System.out.println("카리나의 월급은 " +(9180*6*20)+ "원 입니다.");
		System.out.println("윈터의 월급은 " +(9180*6*20)+ "원 입니다.");
		System.out.println("지젤의 월급은 " +(9180*6*20)+ "원 입니다.");
		System.out.println("닝닝의 월급은 " +(9180*6*20)+ "원 입니다.");
		//괄호 안의 숫자만 보면 무슨의미인지 모른다.
		
		System.out.println();//줄바꿈의 의미
		
		//변수 사용후
		int pay = 18000;
		int time = 7;
		int day = 20;
		System.out.println("나비스의 월급은 "+(pay * time * day) +"원 입니다.");
		//가독성을 위해 변수 사용할 수 있다.
		System.out.println("카리나의 월급은 "+(pay * time * day) +"원 입니다.");
		System.out.println("윈터의 월급은 "+(pay * time * day) +"원 입니다.");
		System.out.println("지젤의 월급은 "+(pay * time * day) +"원 입니다.");
		System.out.println("닝닝의 월급은 "+(pay * time * day) +"원 입니다.");
		
		/*
		 * 변수를 사용하는 이유.
		 * 1. 변수는 우선적으로 값에 의미를 부여할 목적으로 사용
		 * (가독성이 좋음)
		 * 2. 단 한번 값을 기록해두고 필요할때마다 계속 사용할 목적으로 사용
		 * (재사용성)
		 * 3. 유지보수를 쉽게 할 수 있다.
		 */
	}
	//변수의 선언
	public void declareVariable() {
		/*
		 * 변수의 선언 ( 값을 기록하기 위한 변수를 메모리 공간에 확보해두겠다 = 박스를 만들겠다)
		 * [표현법] 자료형 변수이름;
		 * 
		 * 자료형 : 어떤 값을 담아낼지, 어떤 크기의 값을 담아낼지에 따라 변수의 크기 및 모양을 지정하는 부분
		 * 변수명 : 변수의 이름을 정하는 부분.
		 * 
		 * 주의할 점!
		 * 1. 변수명은 소문자로 시작하게끔 이름 지어줄 것(단, 낙타등표기법 지키기)
		 * ex) String userName; (0);
		 * 	   String username; (x);
		 * 2. 같은 영역({})안에서는 동일한 변수명으로 선언불가.
		 * 3. 해당영역에 선언된 변수는 해당영역안에서만 사용가능(다른 일반 메소드에서는 사용불가)
		 * 
		 */
		
		//1. 논리형 자료형 (true, false)
		boolean isTrue;	//	1byte;
		//byte isTrue; 위의 2.에 안되는 예에 해당
		
		//2. 숫자형 자료형 (byte, short, int, long)
		byte bNum;//	1byte;
		short sNum;//	2byte;
		int iNum;//		4byte;
		long lNum;//	8byte;
		
		//3. 실수형 자료형 (float, double)
		float fNum;//	4byte;
		double dNum;// 8byte;
		
		//4. 문자형 자료형 
		char ch;//	2byte;
		
		//5. 문자열 (참조 자료형) -> String은 따로 배울예정
		String str;//	따로 저장크기가 없음.
		
		/*
		 * 변수에 값을 대입하는 법.
		 * [표현법] 변수명 = 값(리터럴);
		 */
		isTrue = true;
		
		bNum = 1;
		sNum = 2;
		iNum = 3;
		lNum = 8L;	//가독성을 높이기 위해 L을 추가한다.
		// long자료형임을 알려주기위해 소문자, 대문자 l, L을 표기해준다.(L은 권장)
		
		fNum = 4.0f;	//f는 필수.
		dNum = 4.0;
		
		ch = 'A';	//' '작은 따움표
		str = "ABC";	//" " 쌍 따움표
		
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
	}
	
	//변수의 초기화 
	public void initVariable() {
		/*
		 * 변수 선언과 동시에 초기화(값 대입)
		 * [표현법] 자료형 변수명 = 값(리터럴);
		 * 
		 * 리터럴 : 값 그 자체
		 */
		//1. 논리 자료형
		boolean isTrue = true;
		
		//byte byte; -> byte는 예약어로 변수명명규칙에 어긋난다.
		
		//2. 정수 자료형
		byte bNum = 1;
		short sNum = 20;
		int iNum = 40;
		long lNum = 100L;
		
		//3. 실수 자료형
		float fNum = 4.313f;
		//소수점 7자리까지 커버가능.
		double dNum = 5.65432123; //소수점 15자리까지 커버가능.
		
		//4. 문자 자료형
		char ch = '김';
		
		//5. 문자열 자료형(참조 자료형)
		String str = "김채영";
		
		System.out.println("isTrue : " + isTrue);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("str : " + str);
		
		int bigInt = 999_999_999; //_로 자릿수 구분 가능하다.
		System.out.println("bigInt : " + bigInt);
		
	}
	//상수 표기법.
	public void constant() {
		//상수란 변하지 않는 값이다.
		int age = 20;
		System.out.println("나이 : " + age);
		
		age = 25;
		System.out.println("5살 더먹은 나이는 : " + age);
		
		final int AGE = 25;
		//상수는 대문자로 표기하는 것이 관례이다.
		//final 이란 키워드를 넣으면 아예 바뀌지 않음.
		//AGE = 26; -> AGE가 final로 된 상수라 바뀔 수 없다.
		System.out.println("내 나이는! : "+ AGE);
	}
}












