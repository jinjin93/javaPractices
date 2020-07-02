//배열 연습 문제 
//package : com.kh.pratice04
//기능제공용 & 실행 클래스 : com.kh.practice4.ArrayPractice.java



// 아래 2차배열의 iarr[0][0]부터 iarr[4][4]까지의 합을 for문을 이용하여 구하기

/* int[][] iarr = {
		   		   		{1 , 4, 7, 10},
		   		   		{100, 20, 3, 324},
		   		   		{78, 577, 89, 1000},
		   		   		{1, 44, 77, 993}
		};
	
	
	
*/






package com.kh.practice04;

public class ArrayPractice {
	public static void main(String[] args) {
		
		int[][] iarr = {
		   		   		{1 , 4, 7, 10},
		   		   		{100, 20, 3, 324},
		   		   		{78, 577, 89, 1000},
		   		   		{1, 44, 77, 993}
		};
		
		int sum = 0;
		for(int i = 0; i < iarr.length; i++) {
			for(int j = 0; j < iarr[i].length; j++) {
				sum += iarr[i][j];
		  }
		}
		
		System.out.println(sum);
	}
}
