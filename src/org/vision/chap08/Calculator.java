package org.vision.chap08;

/* 
 * 어제 만든 것
 * Java 8에서, 함수형 인터페이스(Functional Interface)는 하나의 추상 메소드(abstract method)만을 가진 인터페이스를 말한다.
 * 이러한 인터페이스를 구현하여 구현 객체(implementation object)를 만들 수 있다.
 * 이 구현 객체는 람다 표현식으로도 표현할 수 있다.
 */
	
// FunctionalInterface는 하나만 있어야 한다.
// 이 인터페이스는 람다식에서 활용할 수 있다.
@FunctionalInterface
public interface Calculator {
	int calc(int a, int b);
}


