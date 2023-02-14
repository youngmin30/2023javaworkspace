package org.youngmin.chap10;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = null;
		System.out.println(data); // null은 아무 것도 없는 것을 의미. data에 아무 것도 없는데, 객체가 없는데 .toString() 메소드로 사용하려고 해서 오류 발생한 것
		System.out.println(data.toString()); // 값이 null인 data를 toString() 메소드로 호출함. NullPointerException이 발생함.
		
		
	}

}
