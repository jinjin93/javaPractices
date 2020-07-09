package com.kh.practice08;

public class Run {

	public static void main(String[] args) {
		MyExceptionPractice mep = new MyExceptionPractice();
		
		try {
			mep.checkKHStudent('n');
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

	}

}
