package com.kh.practice06;

//패키지명 (모든 클래스 동일): com.kh.practices06
//Person, Employee, Student, PersonManager, Run(main포함) 클래스 생성
//-----------------------------------------------------
//Person class
//- name : String
//- age : int
//- gender : char

//기본 생성자, 모든 멤버변수를 매개변수로 하는 생성자 생성, setter()/getter()메소드 생성
//+ goWeekdays() : void 메소드 생성 -> "집을 나섭니다" 출력

//-------------------------------------------------
//Employee, Student, Kindergartener 클래스
//Person클래스를 상속받아 goWeekdays메소드를 아래 처럼 바꿔 오버라이딩
//Employee -> "회사에 갑니다" 출력
//Student -> "학교에 갑니다" 출력
//Kindergartener -> "유치원에 갑니다" 출력

//------------------------------------------------
//PersonManager 클래스
//testPerson() : void 메소드 생성하여
//부모클래스의 참조변수를 가지는 Employee, Student, Kindergartener 객체를 각각 생성
//각 참조변수를 instanceof 연산자를 통해 Employee, Student, Kindergartener
//의 클래스타입인지 확인하고 해당 클래스로 down casting하여
//각 클래스의 goWeekdays 메소드 호출
//----------------------------------------------------
//Run 클래스
//PersonManager 객체 생성하여 testPerson메소드 호출
// 출력 예 :  회사에 갑니다
//         학교에 갑니다
//         유치원에 갑니다








public class Employee extends Person {

	@Override
	public void goWeekdays() {
		
		System.out.println("회사에 갑니다");
	}
}
