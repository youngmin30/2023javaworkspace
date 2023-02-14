package org.vision.chap09_1;

import org.vision.chap09.NestedClass2;

public class NestedClass3 {
	// 익명의 nested = inner Class 방식으로 객체를 생성했다.
	// Parent가 클래스 이름은 맞지만, 이 분야에서는 그것을 익명의 클래스라고 표현을 하는 편입니다.
	
	Parent p = new Parent("윤선도", 98) {
		// 새로운 필드 추가 내부에서만 사용할 수 있다.
		// 새로운 메소드도 마찬가지인데
		int children = 19;
		void someMethod() {
			System.out.println("someMethod()를 호출~~");
			System.out.println("자녀 수:" + children);
			newMethod();
		}
		
		// 이 새로운 메소드는 추가해서 내부에서만 사용한다. 내부에서만 호출할 수 있다.
		void newMethod() {
			
		}
	};
		
	
	public static void main(String[] args) {
		NestedClass3 x = new NestedClass3();
		System.out.println(x.p);
		x.p.someMethod();
		// 익명 객체 만들 때에 추가된 필드나 메소드는 그 객체 바깥에서는 사용이 불가하다.
		System.out.println(p.children);
		// p.newMethod();
	}
}
