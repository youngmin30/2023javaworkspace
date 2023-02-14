package org.youngmin.chap106;

// 예외의 전가
// 에외 처리 떠넘기기
// 일단 책을 이해하지 못해서 잘 모르겠어. 일단 쉬자.

public class ThrowsExample { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2"); 
	}

}
