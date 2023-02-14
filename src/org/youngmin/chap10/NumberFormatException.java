package org.youngmin.chap10;

public class NumberFormatException {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1); // praseInt() 문자열을 정수형으로 변환하는 메소드
		int value2 = Integer.parseInt(data2); // NumberFormatException 발생
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	}
}

// data1 변수의 100 문자열은 숫자로 변환이 가능하다.
// 6라인이 정상적으로 실행되지만
// data2 변수의 a100 문자열은 숫자로 변환할 수 없다. 왜지? 숫자로 변환될 수 없는 문자가 있나? ===> 복잡한게 아니라 그냥 스트링 a100을 정수로 바꿀 수 없다는 얘기일 뿐이야.
// NumberFormatException이 발생한다.
