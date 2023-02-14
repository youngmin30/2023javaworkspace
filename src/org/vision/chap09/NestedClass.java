package org.vision.chap09;

public class NestedClass {

	class B{}
	static class C{}
	
	// 클래스의 멤버 필드로 중첩 클래스(이너 클래스)를 사용할 수 있다.
	B bobj = new B();
	C cobj = new C();
	static B bobj2 = new B();
	static C cobj2 = new C();
	
	// 어떤 메소드 내에서도 위의 중첩 클래스를 사용할 수 있다.
	void someMethod() {
		B bobj = new B();
		C cobj = new C();
		// static B bobj = new B();
		// static C cobj = new C();
	}
	void static someMethod2() {
		B bobj = new B(); // static이 아니어서, 쓸 수가 없다?
		C cobj = new C();		
	}
	
	public static void main(String[] args) {
		
	}
}


/* 중첩 클래스 다 중요한 건 아니지만,
* 꼭 알아야 하는 것이 있다.
*/