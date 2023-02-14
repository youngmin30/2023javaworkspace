package org.youngmin.chap106;

public class wilbedeletedMethodd1 {
	

	public void methodd4() {
		
		try {
			method2();
		} catch(ClassNotFoundException e) {
			
			// 예외 처리 코드
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
		public void method2() throws ClassNotFoundException {
			Class clazz = Class.forName("java.lang.String2");
	
		}
}
