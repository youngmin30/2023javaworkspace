package org.vision.chap10.ClassCastException;

public class ClassCastException { // 주 클래스(메인 메소드가 있는 클래스가 주 클래스이다.)

	public static void main(String[] args) { // 주클래스의 메인메소드
			Dog dog = new Dog();  // int x처럼, Dog 타입의 dog 객체에 Dog()라는 클래스를 만들어 넣는다.
			changeDog(dog);  // chageDog()라는 메소드를 직접 만들었고, 여기에 dog를 넣는다.
				
			Cat cat = new Cat(); // Cat 타입의 객체 cat에 Cat() 클래스를 만들어 넣는다.
			changeDog(cat); // chageDog()라는 메소드를 직접 만들었고, 여기에 cat()을 만든다.
		}
			
		public static void changeDog(Animal animal) { // chageDog()라는 메소드에 Animal animal을 위에서 받아줄 것인데, 위에 dog이나 cat이 있어서 둘 중 하나 넣는다.
			if(animal instanceof Dog) { // instanceof의 좌우의 값은 animal과 dog인데, 이 둘을 연산한다. 위에서 animal로 dog가 들어오면 true가 될 것이고, cat이 들어오면 false가 될 것이다.
			Dog dog = (Dog) animal; // dog가 animal로 들어온다면, 당연히 dog로 타입 변환된다. cat이 들어오면 당연히 dog로 타입 변환이 안 된다.
		}
				
		}
}


//뜬금없이 animla, dog, cat을 사용하는 것이 아니라 여기에 클래스가 다 있다. 여기는 메인 메소드가 없는 부클래스이다.
// 보통 부클래스는 주클래스의 하단에 둔다. 그런데 패키지 안에서 따로 뺄 수도 있다.
// class Animal {} // Animal()
// class Dog extends Animal {} // Dog 클래스는 Animal()를 상속 받는다.
// class Cat extends Animal {} // Cat은 Animal을 상속 받는다.
// 만약 이 부클래스들을 같은 패키지에 따른 클래스 파일로 만든다면, class 앞에 public 붙여도 되고 생략해도 되지만, 다른 패키지에 만들면 반드시 public이 필요하다.



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