package org.youngmin.chap10;

public class ClassCastException {

	public static void main(String[] args) {
			Dog dog = new Dog(); // Dog를 dog로 만들었고, dog에 Dog 객체를 넣었다.
			changeDog(dog); // changeDog()라는 메소드를 출력한다.
				
			Cat cat = new Cat();
			changeDog(cat);
		}
			
		public static void changeDog(Animal animal) {
			if(animal instanceof Dog) {
			Dog dog = (Dog) animal; // ClassCastException 발생 가능함
		}
				
		}
	}


class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}




/*
 * 타입 변환 Casting은 강제 타입 변환으로 큰 타입 자료를 작은 타입으로 바꾸는 것
 * 상위 클래스와 하위 클래스 간에 타입 변환이 발생함
 * 구현 클래스와 인터페이스 간에도 타입 변환이 발생함.
 * 
 * 원래는 클래스가 인터페이스보다 더 큰 범주일 수 있는데,
 * 상속 관계를 설명할 때 예를 들어, 지난 수업에서 Remocon.java 인터페이스 아래에 구현되는 삼성리모콘. 엘지리모콘 같은 구현 클래스의 관계로 본다면.
 * 그런 경우는 인터페이스인 Remocon.java가 더 큰 개념이고,
 * 삼성리모콘, 엘지리모콘은 자손으로 보게 되는 것이다.
 * 그래서 여기에서 강제 타입 변환이 된다고 설명하는 것이다.
 */