package com.kh.chap02_set.part01_hashset.model.vo;

public class Student {

	private String name;
	private int age;
	private int score;
	
	public Student() {}
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age; // 31 * 1 + 23 => 54
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		// 31 * 55 + "김채영".hashCode() 
		result = prime * result + score;
		// 31 * (31 * 55 + "김채영".hashCode()) + 80
		return result; 
		//내부적으로 hashCode()값을 만드는 방법.
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	
//	@Override
//	//Override경우, 내가 오버라이드하려고하는 부모클래스에 저장되어있는 이름과 매개변수이름과 동일해야한다.
//	//따라서 매개변수 타입을 둘다 일치시켜야되는 데 안되면, Object로 매개변수를 넣어야한다.
//	//Override의 특징때문에 Object로 매개변수를 넣어야한다.
//	public boolean equals(Object obj) { // Object obj = Student std2
//		
//		// Student객체.equals(비교할 Student객체);
//		
//		// Student this			Object obj
//		// this.name 			(Student)obj
//		Student other = (Student)obj; // Object타입으로 받은 obj를 Student로 강제형변환하여서 other에 넣어줌.
//		
//		//this.name.equals(other.name);
//		//같은 Student내부에 있기 때문에 .으로 접근 가능하다.
//		//this.age == other.age;
//		//this.score == other.score;
//		if(this.name.equals(other.name) && this.age == other.age && this.score == other.score) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//	
//	@Override
//	public int hashCode() {
//		
//		return (name + age + score).hashCode();
//		//문자열 합친형태의 hashCode()값을 리턴.
//		// name + age + score
//		//"김채영"  23     80   =>  "김채영2380".hashCode();
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
