package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student sd = new Student();
		
		sd.setGrade(1);
		sd.setClassroom(2);
		sd.setName("김채영");
		sd.setHeight(158.3);
		sd.setGender('F');

		sd.information();
	}

}
