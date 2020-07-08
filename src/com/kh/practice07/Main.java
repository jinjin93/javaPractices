package com.kh.practice07;

public class Main {

	public static void main(String[] args) {
		
	Main main = new Main();
	
	//main 클래스의 goToTravel 메소드 호출하여 Country 타입의 객체인 
	//Korea, Canada, Spain객체를 매개변수로 넣어준다.
	main.goToTravel(new Korea());
	main.goToTravel(new Canada());
	main.goToTravel(new Spain());
	}
	
	
	        //각 클래스의 goToCapital 메소드를 호출하기 위해 Country 타입의 
	        //매개변수를 받는 goToTravel 메소드 생성 
	        //자식 객체는 부모클래스의 데이터타입 가질 수 있다. 
	public void goToTravel(Country country) {
		country.goToCapital();
	}
	

}
