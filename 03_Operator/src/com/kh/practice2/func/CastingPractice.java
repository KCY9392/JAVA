package com.kh.practice2.func;

//연산자 실습문제
public class CastingPractice {
	public void method() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		
		
		System.out.printf("%d\n",(iNum1/iNum2));
		//System.out.printf("%d\n",(iNum1-iNum2*2));
		System.out.printf("%d\n",(int)dNum);
		
		System.out.println();
		
		System.out.printf("%.1f\n",iNum2*dNum);
		System.out.printf("%.1f\n",(float)iNum1);
		//System.out.printf("%.1f\n",iNum2+fNum*2);
		
		System.out.println();
		
		System.out.printf("%.1f\n",iNum1 / (double)iNum2);
		System.out.printf("%.1f\n",dNum);
		//System.out.printf("%.1f\n",(float)iNum1-3*dNum);
		
		System.out.println();
		
		System.out.printf("%d\n",(int)fNum);
		System.out.printf("%d\n",iNum1 / (int)fNum);
		
		System.out.println();
		
		System.out.printf("%.7f\n",iNum1 / fNum);
		System.out.printf("%.16f\n",iNum1 / (double)fNum );
		// double로 하니까 됨!
		
		System.out.println();
		
		System.out.printf("'%c'\n",ch);
		System.out.printf("%d\n",(int)ch);
		System.out.printf("%d\n",(int)(ch+iNum1));
		System.out.printf("'%c'\n",(ch+iNum1));
	}
}
