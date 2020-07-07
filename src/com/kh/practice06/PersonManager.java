package com.kh.practice06;

public class PersonManager {

	public void testPerson() {
		Person p1 = new Employee();
		Person p2 = new Student();
		Person p3 = new Kindergartener();
		
		
		if(p1 instanceof Employee) {
			((Employee)p1).goWeekdays();
		}
		
		if(p2 instanceof Student) {
			((Student)p2).goWeekdays();
		}
		
		if(p3 instanceof Kindergartener) {
		     ((Kindergartener)p3).goWeekdays();
		}
		
		
		}
		


}
