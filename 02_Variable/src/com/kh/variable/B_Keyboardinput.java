package com.kh.variable;

import java.util.Scanner;

public class B_Keyboardinput {
	
	//키보드로 값을 입력받아 인적사항을 출력하는 프로그램.
	public void inputTest1() {
		/*
		 * 자바에서 이미 제공하고 있는 java.util.Scanner클래스.
		 * Scanner 클래스 안에 작성되어 있는 메소드를 호출해서 사용.
		 */
		Scanner sc = new Scanner(System.in);
		
		//사용자의 인적사항(키, 나이, 이름) 입력받기.
		System.out.print("이름을 입력해 주세요 : ");
		//String name = sc.next();
		//next()는 공백을 입력하면 공백받은 값의 앞부분까지만 돌려준다.
		//공백을 입력하면 에러가 난다.
		/*
		 * sc.next()는 사용자가 입력한 값 중에 공백이 있을 경우에
		 * 공백 이전까지만 출력한다.
		 * ex) 김 채영 -> 김
		 * sc.nextLine();은 사용자가 엔터를 입력하기 전까지 대기상태이고,
		 * 공백과 무관하게 엔터전까지의 값을 전달해준다.
		 * 공백도 출력한다.
		 * 엔터앞까지의 값을 메모리에 전달하고, 엔터값을 지워줌
		 */
		String name = sc.nextLine();
		
		
		//next()로 키보드로부터 받은 값을 문자열로 돌려주는 메소드.
		//이름을 입력하면 메소드 종료하고 다음으로 넘어간다.
		
		System.out.print("키를 입력해 주세요(xx.x) : ");
		double height = sc.nextDouble();
		//nextDouble()로 키보드로부터 받은 값을 double형 변수로 돌려주는 메소드.
		//사용자가 엔터를 입력하기 전까지 대기
		
		//!! 버퍼의 엔터 \n를 없애는 방법 !!
		sc.nextLine(); //버퍼에 남아있던 엔터를 비워주기 위해 실행.
		
		System.out.print("주소를 입력해 주세요 : ");
		String address = sc.nextLine();
		
		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		//nextInt()로 키보드로부터 받은 값을 int(정수)형 변수로 돌려주는 메소드.
		//사용자가 엔터를 입력하기 전까지 대기
		
		//000에 사시는 000님의 키는 000.0이고, 나이는 00입니다.
		System.out.println(address + "에 사시는"+name + "님의 키는 "+height+"이고, 나이는 "+age+"입니다.");
		//System.out.println("이름은 : " + name);
		
		sc.close();
	}
	
	//Scanner 설명
	public void inputTest2() {
		Scanner sc = new Scanner(System.in);
		/*
		 * System.in 을 통해 값을 입력해서 넣겠다는 의미
		 * 문자열을 뽑을 때 => sc.next(), sc.nextLine()
		 * 정수값을 뽑을 떄 => sc.nextInt(), sc.nextByte(), sc.nextShort(), sc.nextLong()
		 * 실수값을 뽑을 때 => sc.nextDouble(), sc.nextFloat()
		 * 
		 * 논리값을 뽑을떄 => sc.nextBoolean()이 있지만 별로 안씀
		 * 
		 * 문자값 뽑을 때 sc.nextChar() (x) 없음. !!!
		 */
		
		//인적사항 출력하는 프로그램(이름, 성별(M,F), 나이, 키)
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(M/F) : ");
		//char gender = sc.nextLine();
		//에러가 난다.
		//char타입 변수는 nextLine()으로 받을 수 없다.
		char gender = sc.nextLine().charAt(0);
		
		//"남자".charAt(0); -> "남자" 문자열의 첫번째 한글자를 가져오겠다는 의미
		// 1,2,3,4,5 일반적 숫자 순서
		// 0,1,2,3,4 컴퓨터의 숫자 순서
		
		//"apple" 문자열의 길이는 5
		// 01234  인덱스 순서
		// apple에서 4번 인덱스의 문자는 ? 'e'
		
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		//이름 : 000, 성별 : 0, 나이 : 00, 키 : 00.0 로 출력
		System.out.println("이름 : "+name+ " , 성별 : "+gender+ " , 나이 : "+age+" , 키 : "+height);
		
		String myName = "김채영";
		myName.charAt(1);
		//charAt()메소드는 문자열 뒤에 사용 가능하다.
		
		sc.close();
	}
	/*
	 * 정리
	 * 1. 콘솔 창(모니터)에 출력하기 위해 : System.out.print[in]()메소드 이용
	 * 2. 콘솔 창(키보드)에 입력받기 위해 : Scanner 이용해서 (nextLine, next, nextInt, nextDouble ...)
	 * 
	 * > 주의사항!! <
	 * 1) sc.nextxxx()메소드 뒤에 sc.nextLine()메소드가 와야될 경우
	 * sc.nextLine()메소드를 한번 더 써줘서 버퍼에 남아있는 '엔터(\n)'값을 빼주는 과정에 필수.
	 * 2) '문자'값을 입력받아야 할 경우
	 * sc.nextLine()메소드를 통해 우선 문자열을 입력받고 그 뒤에 .charAt(순번)메소드를 통해 문자 하나 추출.
	 * 
	 */
}












