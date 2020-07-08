package com.kh.practice07;
/*패키지명(모든 클래스 동일) : com.kh.practice07
클래스 : Country, Korea, Canada, Spain, Main(main포함) 생성

Country클래스에 goToCapital():void 메소드 생성
 -> 수도에 도착했습니다 출력 구문 작성

Korea, Canada, Spain클래스
 -> Country클래스를 상속받아 goToCapital()메소드 오버라이딩
 -> 각 나라 수도에 도착했습니다 문구 출력 
 -> ex )서울에 도착했습니다
                 오타와에 도착했습니다
        마드리드에 도착했습니다

Main클래스
 -> + goToTravel(Country country) : void 메소드
 -> Country클래스의 goToCapital() 메소드 호출
 
 -> Main 메소드
 -> 메인 클래스의 goToTravel 메소드에 매개변수를 넣어서
 -> 출력 예시 호출
 -> 출력 예시 : 서울에 도착했습니다
                          오타와에 도착했습니다
                          마드리드에 도착했습니다
 
 
*/





public class Canada extends Country{

	@Override
	public void goToCapital() {
		System.out.println("오타와에 도착했습니다");
	}
}
