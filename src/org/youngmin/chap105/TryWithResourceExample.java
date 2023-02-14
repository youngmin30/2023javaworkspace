package org.youngmin.chap105;

public class TryWithResourceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
			throw new Exception();
		
		} catch(Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}

	}

}


/*
* try-with-resources를 사용하기 위해서는 조건이 있음
* 리소스 객체는 java.lang.AutoCloseable 인터페이스를 구현하고 있어야 함.
* AutoCloseable에는 close() 메소드가 정의되어 있음.
* 
* try-with-resources는 바로 이 close() 메소드를 자동 호출한다.
* 
* API 도큐먼트에서 AutoCloseable 인터페이스를 찾아
* All Known Implementing Classes: 를 보면
* 
* try-with-resources와 함께 사용할 수 있는 리소스가 어떤 것이 있는지 알 수 있다.
* 
* AutoCloseable을 구현해서
* FileInputStream 클래스를 작성했다.
* 
* TryWithResourcesExample 클래스의 main() 메소드에서 try-with-resources를 사용하면
* 예외가 발생하는 즉시 자동으로 FileInputStream의 close()가 호출된다.
*
*
*/



