package com.kh.practice05;

public class Main {

	public static void main(String[] args) {
		
		Beverage[] beverage = new Beverage[4];
		beverage[0] = new Beverage("아메리카노", 4000, 'H');
		beverage[1] = new Beverage("카페라떼", 4500, 'I');
		beverage[2] = new Beverage("자몽에이드", 4800, 'I');
		beverage[3] = new Beverage("허브티", 4800, 'H');
		
		for(int i = 0; i < beverage.length; i++) {
			System.out.println(beverage[i].getPrice());
		}
		

	}

}
