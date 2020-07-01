package com.kh.practice03;

import java.util.Scanner;

public class LoopPractice {	

//<반복문 연습문제>
// 실행용 클래스 : com.kh.practice3.Main.java
// 기능제공용 클래스 : com.kh.practice3.LoopPractice.java
//	
// 두자리 정수 입력 받는다.
// 1부터 입력받은 숫자까지 출력하고 3의 배수는 숫자 출력 후 옆에 3의 배수인지도 표시
// 예 1 
//   2
//   3은 3의 배수 입니다
//   4...
//
	
	
	
	
	public void practice03() {
		System.out.print("두자리 정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				System.out.println(i + "은 3의 배수 입니다.");
			} else {
				System.out.println(i);
			}
		}

	}

}
