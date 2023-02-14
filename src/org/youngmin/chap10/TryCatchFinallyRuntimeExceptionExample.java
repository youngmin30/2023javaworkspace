package org.youngmin.chap10;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		
		// 필드
		String data1 = null;
		String data2 = null;
		
		
		// try ~ catch로 오류가 발생할 것 같은 구문의 예외 처리
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("실행 방법");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return; // return이 있으면 위 메소드를 끝내라는 의미
		}
		
		// 100, 200을 data1, data2에 넣으면 매개 변수가 2개이므로 수가 부족하다는 catch 구문의 오류가 나오지 않는다.
		// 100만 넣으면 매개 변수가 2개인데 하나만 나오니까 오류라고 한다.
		// 100, 200을 맞게 넣으면, 오류가 아니므로 다음 try catch 구문으로 넘어간다.
		// try catch 구문에서 100 200dl 문자열이었으니 int로 바꾸고 더하기를 실행한다.
		// finally는 항상 실행된다.
		// return은 메소드를 빠져나가는 것이다. 돌아가니까 빠져나간다. 아니지 break와는 다르다.
		
	
			try {
				int value1 = Integer.parseInt(data1); // 배열, 인덱스는 문자기 때문에 숫자로 안 바뀌어서 여기서 바로 catch로 넘어간다.
				int value2 = Integer.parseInt(data2); 
				int result = value1 + value2;
				System.out.println(data1 + "+" + data2 + "=" + result); // 오류가 나면 수행이 안 되고, catch() {}로 넘어간다.
			} catch (java.lang.NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없습니다.");	
			}finally {
			System.out.println("다시 실행하세요.");
		}
		}
}
