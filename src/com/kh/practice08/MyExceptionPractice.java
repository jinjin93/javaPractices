package com.kh.practice08;

import java.util.Scanner;

public class MyExceptionPractice{
	
	
	
	
	public void checkKHStudent(char yOrN) throws MyException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("c반 학생입니까? (y/n)");
		yOrN = sc.next().charAt(0);
		
		if(yOrN == 'N' ||  yOrN == 'n') {
			throw new MyException("c반 학생만 강의실에 들어올 수 있습니다");
		} else {
			System.out.println("반갑습니다");
		}
	}
	
}
