package org.vision.chap09_1;

public class Parent {
	// 눈에 보이지 않지만, 기본 생성자가 존재한다. 비어 있을 수도 있단 이야기이다.
	String name;
	int age;
	
	public Parent() {}
	public Parent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void someMethod() {}
	
	@Override
	public String toString() {
		return "아버지 "+name+"는 연세가 "+age+"세 입니다.";
	}

}
