package com.kh.enumBasic;

import java.util.Arrays;

// 1) 기본 사용법
public enum Day1 {
   MONDAY, // static, final 키워드를 붙이지 않았는데 자동으로 들어가 있음.
   TUESDAY,
   WEDNESDAY,
   THURSDAY,
   FRIDAY,
   SATERDAY,
   SUNDAY
}

// 2) enum 안의 각 상수 요소마다 값을 더 추가시키고 싶은 경우
//    비슷한 상수필드끼리 매칭시킬 때 사용함.

enum Day2 { // 하나의 클래스 안에 만들때는 public 하나만 사용해야함
   // 1) 각 요소 우측에 매칭시킬값을 추가시킴
   MONDAY("MON"), 
   TUESDAY("TUE"),
   WEDNESDAY("WED"),
   THURSDAY("THU"),
   FRIDAY("FRI"),
   SATERDAY("SAT"),
   SUNDAY("SUN");
   
   // 2) 필드 값 추가 (매칭시킬 자료형)
   // enum 클래스 안에서는 private 접근제한자로 작성해야하고 외부에서 접근 가능하도록 
   // getter 작성 enum 안에 내가 원하는값 추가시키고 싶을때 생성자에 내가 원하는 타입의 자료형을 제시해서 필드에 초기화
   private final String shortName;
   
   // 3) 생성자 추가
   Day2(String shortName) {
      this.shortName = shortName;
   }
   
   // 4) getter 메서드 작성
   public String shortName() { 
      return shortName;
   }
}

// 매핑시킬 값이 여러개인 경우
enum Day3 { // 하나의 클래스 안에 만들때는 public 하나만 사용해야함
   // 1) 각 요소 우측에 매칭시킬값을 추가시킴
   MONDAY("MON" , 1), 
   TUESDAY("TUE" , 2),
   WEDNESDAY("WED" , 3),
   THURSDAY("THU" , 4),
   FRIDAY("FRI" , 5),
   SATERDAY("SAT" , 6),
   SUNDAY("SUN" , 7);
   
   // 2) 필드 값 추가 (매칭시킬 자료형)
   // enum 클래스 안에서는 private 접근제한자로 작성해야하고 외부에서 접근 가능하도록 
   // getter 작성 enum 안에 내가 원하는값 추가시키고 싶을때 생성자에 내가 원하는 타입의 자료형을 제시해서 필드에 초기화
   private final String shortName;
   private final int day;
   
   // 3) 생성자 추가
   Day3(String shortName , int day) {
      this.shortName = shortName;
      this.day = day;
   }
   
   // 4) getter 메서드 작성
   public String shortName() { 
      return shortName;
   }
   
   public int day() {
      return day;
   }
   
   // 필드 값을 통해 enum을 찾는 메서드 추가.
   public static Day3 valueOfShortName(String shortName) {  // enum은 static이라서 static 키워드로 작성해야함
      
      Day3 days [] = Day3.values();
      for(int i = 0; i< days.length; i++) {
         if(days[i].shortName.equals(shortName)) {
            return days[i];
         }
         
      }
      return null;
      
      // 람다식 방법
      //return Arrays.stream(values()).filter(value -> value.shortName.equals(shortName)).findAny().orElse(null);
      
      
   }
   public static Day3 valueOfDay(int day) {  
	   Day3 days [] = Day3.values();
	   
	   for(int i = 0; i< days.length; i++) {
		   if(days[i].day==day) {
			   return days[i];
		   }
		   
	   }
	   return null;
   }
}
   
   
   
enum Day4 { // 하나의 클래스 안에 만들때는 public 하나만 사용해야함
	   // 1) 각 요소 우측에 매칭시킬값을 추가시킴
	   MONDAY("MON" , 1){
		   //함수 추가 2단계 ) 추상메소드로 상수에서 오버라이딩
		   @Override
		   public void printDay() { System.out.println("월요일입니다."); }
	   }, //익명클래스로 전환된다
	      //정상적인 방법으로 사용이 불가하다
	   TUESDAY("TUE" , 2){
		   @Override
		   public void printDay() { System.out.println("화요일입니다."); }
	   },
	   WEDNESDAY("WED" , 3){
		   @Override
		   public void printDay() { System.out.println("수요일입니다."); }
	   },
	   THURSDAY("THU" , 4){
		   @Override
		   public void printDay() { System.out.println("목요일입니다."); }
	   },
	   FRIDAY("FRI" , 5){
		   @Override
		   public void printDay() { System.out.println("금요일입니다."); }
	   },
	   SATERDAY("SAT" , 6){
		   @Override
		   public void printDay() { System.out.println("토요일입니다."); }
	   },
	   SUNDAY("SUN" , 7){
		   @Override
		   public void printDay() { System.out.println("일요일입니다."); }
	   };
	   
	   // 위의 printDay()메소드를 호출할 수 있는 방법 : 추상형 메소드
	   
	   // 상수별 함수추가 1단계
	   // 상수내부함수를 실행시키기 위한 추성메소드 선언.
 	   public abstract void printDay(); // 이 메소드를 작성하면 위의 printDay()메소드를 호출할 수 있게한다 
	   
	   // 2) 필드 값 추가 (매칭시킬 자료형)
	   // enum 클래스 안에서는 private 접근제한자로 작성해야하고 외부에서 접근 가능하도록 
	   // getter 작성 enum 안에 내가 원하는값 추가시키고 싶을때 생성자에 내가 원하는 타입의 자료형을 제시해서 필드에 초기화
	   private final String shortName;
	   private final int day;
	   
	   // 3) 생성자 추가
	   Day4(String shortName , int day) {
	      this.shortName = shortName;
	      this.day = day;
	   }
	   
	   // 4) getter 메서드 작성
	   public String shortName() { 
	      return shortName;
	   }
	   
	   public int day() {
	      return day;
	   }
	   
	   // 필드 값을 통해 enum을 찾는 메서드 추가.
	   public static Day4 valueOfShortName(String shortName) {  // enum은 static이라서 static 키워드로 작성해야함
	      Day4 days [] = Day4.values();
	      
	      for(int i = 0; i< days.length; i++) {
	         if(days[i].shortName.equals(shortName)) {
	            return days[i];
	         }
	         
	      }
	      return null;
	      
	      //return Arrays.stream(values()).filter(value -> value.shortName.equals(shortName)).findAny(
	   }
	   
	   
	   public static Day4 valueOfDay(int day) {  
		      Day4 days [] = Day4.values();
		      
		      for(int i = 0; i< days.length; i++) {
		         if(days[i].day==day) {
		            return days[i];
		         }
		         
		      }
		      return null;
	   }
	   
	   public void printDay1() {
		   switch(this){ // this : enum Day4를 가리킴
			   case MONDAY : System.out.println("월요일입니다.");break;
			   case TUESDAY : System.out.println("월요일입니다.");break;
			   case WEDNESDAY : System.out.println("월요일입니다.");break;
			   case THURSDAY : System.out.println("월요일입니다.");break;
			   case FRIDAY : System.out.println("월요일입니다.");break;
			   case SATERDAY : System.out.println("월요일입니다.");break;
			   case SUNDAY : System.out.println("월요일입니다.");break;
				   
		   }
	   }
	   // 위 방법으로 작성하게되는 경우, 새로운 상수필드가 추가되면 해당 case문도 일일히 수정해줘야한다
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   
}
  
