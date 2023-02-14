package org.youngmin.chap10;

public class MultiCatchExample {

	public static void main(String[] args) {
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			
			System.out.println(data1+"+"+data2+"="+result);
			
			
//		// catch 구문이 실행된다는 것은, try 구문의 내용에 오류가 있다는 의미이다. 맞는 말이야?
//		} catch (ArrayIndexOutOfBoundsException | java.lang.NumberFormatException e) { // 이 둘 중 하나의 오류가 발생했다는 의미이다. 배열이니까 전자일 확률 높음. 확인 가능함.
//			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다..");
//			

		// 정확히 어떤 오류인지를 확인한다.=================================================================================
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException 오류가 발생했습니다.");
			
		
		} catch (java.lang.NumberFormatException e) {
			e.printStackTrace();
			System.out.println("NumberFormatException 오류가 발생했습니다.");
			
		
		
		
		// 어떤 예외가 있을 지 예측은 되지 않지만, 혹여라도 나올 수 있는 예외를 잡기 위해서 마지막으로 예외 처리한다.
		} catch(Exception e) {
			System.out.println("알 수 없는 예외 발생");
			
		
		// finally 구문은 항상 실행된다.
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
