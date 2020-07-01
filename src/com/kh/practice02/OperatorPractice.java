package com.kh.practice02;

import java.util.Scanner;

public class OperatorPractice {
	public void practice01() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문제해결 시나리오 유형 점수 입력 : ");
		int scenarioScore = sc.nextInt();
		System.out.print("서술형 유형 점수 입력 : ");
		int writingScore = sc.nextInt();
		
		int avg = (scenarioScore + writingScore) / 2;
		
		String result = (scenarioScore >= 40 &&  writingScore >= 40 && avg >= 60) ? "통과" : "재시";
		System.out.println(result);
		 
	}
	
	
}
