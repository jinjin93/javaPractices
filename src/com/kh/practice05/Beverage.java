package com.kh.practice05;

//vo클래스 : com.kh.practice05.Beverage.java
//main클래스 : com.kh.practice05.Main.java

//vo클래스 ----------------------------------- 
//- beverage : String //음료 이름
//- price : int       //가격
//- hotOrIce : char   //핫, 아이스 여부 ('H', 'I'로 표기)
//기본생성자, 모든 멤버변수를 매개변수로 하는 생성자, 모든 멤버변수에 대한 setter/getter메소드 생성

//main클래스 -------------------------------------
//Beverage 클래스에 대한 크기가 4인 객체 배열 생성
// 네가지 음료    ex) 아메리카노, 4500, 'H' 
// 에 대한 객체 생성하여 배열에 담고 객체에 접근하여 네가지 음료의 가격 출력







public class Beverage {
	private String beverage; 
	private int price;
	private char hotOrIce;
	
	public Beverage() {}

	public Beverage(String beverage, int price, char hotOrIce) {
		super();
		this.beverage = beverage;
		this.price = price;
		this.hotOrIce = hotOrIce;
	}

	public String getBeverage() {
		return beverage;
	}

	public void setBeverage(String beverage) {
		this.beverage = beverage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public char getHotOrIce() {
		return hotOrIce;
	}

	public void setHotOrIce(char hotOrIce) {
		this.hotOrIce = hotOrIce;
	}
	
	
	
	
}
