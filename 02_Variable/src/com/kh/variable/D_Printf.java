package com.kh.variable;

public class D_Printf {
	
	public void printfTest() {
		/*
		 * System.out.println(출력하고자하는값)=> 값 출력하고 줄바꿈을 넣어줌.
		 * System.out.print(출력하고자하는값) => 값 출력하고 끝. 줄바꿈X.
		 * 
		 * System.out.printf("출력하고자하는형식",변수,변수 ...) (줄바꿈X)
		 * => f 는 format(형식)을 의미
		 * => 형식에 맞춰서 내용을 출력하고, 줄바꿈을 하지않음.
		 * => 문자열안에 값(변수)이 들어갈 공간을 형식으로 확보를 해줘야한다.
		 * 
		 *  형식
		 *  %d : 정수에 대한 변수값을 넣겠다.
		 *  %f : 실수
		 *  %c : 문자
		 *  %s : 문자열
		 *  
		 */
		
		//정수 테스트
		int iNum1 = 10;
		int iNum2 = 20;
		
		// iNum1 : xx, iNum2 : xx
		System.out.println("iNum1 : "+iNum1+ " , iNum2 : "+iNum2);
		System.out.printf("iNum1 : %d , iNum2 : %d\n", iNum1,iNum2);
		
		// 10 + 20 = 30;
		System.out.println(iNum1+ " + " +iNum2+ " = " + (iNum1 + iNum2));
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, (iNum1+iNum2));
		
		//System.out.printf("%5d %-5d\n", iNum1, iNum2);
		//%5d는 앞에 공백 5칸은 확보하라는 의미
		//%-5d는 뒤로 공백 5칸은 확보하라는 의미
		
		// Leftctrl + z 누르면 작성했던 내용이 롤백됨.
		// Leftctrl + y 누르면 롤백되었던 내용이 원상복귀됨.
		// Leftctrl + shift + c 누르면 여러줄 한번에 주석처리함.
//		System.out.printf("%5d\n", 500);
//		System.out.printf("%5d\n", 3000);
//		System.out.printf("%5d\n", 18000);
//		System.out.printf("%5d\n", 1);
		
		//실수 테스트
		double dNum = 1.23456789;
		System.out.printf("dNum : %f\n", dNum);//1.234568
		//왜 이렇게 출력되냐면,
		//소수점 6자리까지만 %f로 출력되고, 뒤의 소수점은 반올림되어서 출력됨.
		
		System.out.printf("dNum : %.1f\n", dNum);
		//%.1f는 소수점 첫번째자리수까지 표현
		
		//문자와 문자열 테스트.
		char ch = 'a';
		String str = "Hello";
		
		//출력하고자하는 형식 a Hello
		System.out.printf("%c %s\n", ch, str);
		System.out.printf("%C %S\n", ch, str);
		
		//System.out.printf("%d 음?? 돼?");
		//포멧의 변수가 없다는 에러가 뜸.
		
		System.out.printf("%d\n", 100,200);
		//100만 출력되고 200은 쓸모없는 값이 됨.
		
		System.out.printf("%s\n", "음?? 돼??");//잘 출력됨.
		
		System.out.printf("%s\n", ch);
		//문자열은 한문자도 출력가능하다.
		
		System.out.printf("%10s \n","10칸?");
		
		//System.out.printf("%d% 할인중!", 20);
		//오류남.
		//괄호 내부에서 첫번째의 문자열에 %다음에 아무문자가 없기때문에 오류남.
		//%를 쓰려면 %%라고 써야된다.
		
		System.out.printf("%d%% 할인중!\n", 20);
		
		
		System.out.printf("%d %n 할인중!\n", 20);
		//%n도 \n과 같은 의미이다.
		
		System.out.printf("%15.5f\n", 500.1234);
		
	}
}






















