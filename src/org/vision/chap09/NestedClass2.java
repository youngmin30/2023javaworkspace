package org.vision.chap09;

public class NestedClass2 {
	
	int age = 20; // age는 멤버 필드이면서, 전역 변수의 성질을 가진다. 즉, NestedClass2의 어느 위치에서도 사용할 수 있다.
	static String name = "홍길동";
	
	public static void main(String[] args) {
		int age = new NestedClass2().age; // 이렇게 위에 있는 age를 이곳에서도 사용할 수 있다.
		System.out.println(age);
		System.out.println(name); // 
		
		
	//============= 로컬 클래스가 있는 메소드를 호출하기
	someMethod2(30000); // 얘를 사용하려면, 아래 로컬 클래스인 로컬 푸드를 statcic을 붙이면 된다. 그러나 붙이고 싶지 않으면, 객체를 만면 된다.
	
		
	}
	
	// someMethod()는 위에 있는 main 메소드가 호출한다.
	public void someMethod() {
		System.out.println(age);
		System.out.println(name);
	}
	
	
	// 이 메소드 someMethod2 의 내부에 있는 로컬 클래스 LocalFood 내부로, 
	// 매개 변수 price 를 전달하려면
	// 전달이 가능하다. 그러나
	// 이 매개변수의 값을 수정할 수는 없다.
	public static void someMethod2(int price) { // int 앞에는 final이 이미 있는 것, 자바 1.7까지는 명시적으로 final을 붙였어야 함. 에러가 없어지지만, 다른 작업이 안 됨.
		System.out.println("일단:"+price);
		int new_price = (int) (price * 1+.15); // 15 퍼센트를 올리겠다는 의미이다. price는 price*1.15;
		System.out.println("이단:"+price);
		// 로컬 클래스는 그 메소드 안에서만 사용할 수 있고, 접근 제한자나 static을 붙일 수 없는 메소드이다.
		class LocalFood{
			void some() {
				System.out.println("이 로컬푸드 가격:"+new_price);  // 이것을 받아주도록 하게 위해서는, 해결책은? 새로운 변수를 만드는 것이다.
			}
		}
		LocalFood x = new LocalFood();
		x.some();
	}
}

// main 메소드는 static이다.
// static한 메소드 내에서는 바깥에 있는 전역 변수를 참조할 때,
// static이 붙지 않은 것은 객체를 만든 다음에 불러와야 한다.
// 객체를 부른다는 것의 의미는, new를 말한다. age처럼.
// 그러나 static이 붙어 있다면, 원래 객체를 생성하지 않고 사용하는 놈이므로,
// 그대로 가져와 사용할 수 있다. name처럼


