package org.youngmin.chap10;

public class ArrayIndexOutOfBoundsExceptionExample {
	
	public static void main(String[] args) {
		
		if(args.length == 2) { // 배열의 값을 읽기 전에, 배열의 길이를 조사한다. ==> 배열의 길이가 2와 동일하니? 동일하면, if 블록 안의 내용을 실행하고 아니라면 else 블록을 실행해
		
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]"+data1);
			System.out.println("args[1]:"+data2);
		
		} else {
		
			System.out.println("[실행 방법]");
			System.out.println("java ArrayIndexOutOfBoundsExample ");
			System.out.println("값1 값2");
		}
	}

}


/* ArrayIndexOutOfBoundsException 424쪽부터 425쪽까지의 코드 설명
 * ArrayIndexOutOfBoundsExceptionExample.java 
 * 424쪽 위 코드에서 run Configuration을 싫행하고 매개 변수를 두 개 주었을 때는, 길이가 2이기 떄문에 둘이 줓력되는데,
 * 434쪽 코드에서 배열, 인덱스, 색인 세개 값을 주면 길이가 2를 넘어서기 때문에 즉 배열의 크기가 2인데 3이 되기 떄문에 if의 조건을 만족하지 않아서
 * else문이 아래처럼 출력된 것이다.
 */