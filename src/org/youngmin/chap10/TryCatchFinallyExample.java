package org.youngmin.chap10;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

}


/*
 * 
* try{} catcyh{}
* try 블록에 넣는 내용은 오류가 발생할 것으로 예측되는 내용을 넣는 것이다.
* 
* catch() {}
* catch(오류 이룸 e)
*
*/