package com.kh.practice08;

//패키지명 (모든 클래스 동일) : com.kh.practice08
//MyException, MyExceptionPractice, Run(main포함) 클래스 생성
//MyException 클래스 : 사용자 정의 예외 클래스
//MyExceptionPractice 클래스 : 입력값이 n일 때 예외를 발생시키도록 하는 클래스 
//
//아래처럼 출력되는 사용자 정의 함수를 만드시오
//
// 키보드로 n 또는 N 입력 받았을 때
//출력 ) c반 학생입니까? (y/n)
//     n
//     c반 학생만 강의실에 들어올 수 있습니다
//
// y또는 Y 입력 받았을 때
//출력 ) c반 학생입니까? (y/n)
//      y
//       반갑습니다
//
//




public class MyException extends Exception {
	
	public MyException() {}
	
	public MyException(String msg) {
		super(msg);
	}

	
}
