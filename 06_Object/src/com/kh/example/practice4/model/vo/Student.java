package com.kh.example.practice4.model.vo;

public class Student {
	private int grade, classroom;
	private String name;
	private double height;
	private char gender;
	
	public Student() {}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGrade() {
		return grade;
	}
	
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public int getClassroom() {
		return classroom;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	
	
	
	public void information() {
		System.out.println(grade+"학년 "+classroom+"반 ");
		System.out.println("이름 : "+name);
		System.out.println("키는 "+height);
		System.out.println("성별은 "+gender);
	}
}
