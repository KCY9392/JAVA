package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	public StudentMenu() {
		StudentController sct = new StudentController();
		
		System.out.println("========= 학생 정보 출력 =========");
		for(int i=0; i<sct.printStudent().length; i++) {
			System.out.println(sct.printStudent()[i].inform());
		}
		
//		Student [] sArr = sct.printStudent();	//얕은 복사의 개념.
//		for( Student st : sArr) {
//			System.out.println(st.inform());
//		}
		
		System.out.println("\n========= 학생 성적 출력 =========");
		
		System.out.printf("학생 점수 합계 : %d\n",((int)sct.avgScore()[0]));
		System.out.printf("학생 점수 평균 : %.1f\n",sct.avgScore()[1]);	
		
//		double [] dArr = sct.avgScore();	//얕은 복사의 개념.
//		System.out.printf("학생 점수 합계 : %d\n",((int)dArr[0]));
//		System.out.printf("학생 점수 평균 : %.1f\n",dArr[1]);	
		
		
		System.out.println("\n========= 성적 결과 출력 =========");
		for( Student st : sct.printStudent()) {
			if(st.getScore()< sct.CUT_LINE) {
				System.out.printf("%s학생은 재시험 대상입니다.\n",st.getName());
			}else {
				System.out.printf("%s학생은 통과입니다.\n",st.getName());
			}
		}
	}
}
