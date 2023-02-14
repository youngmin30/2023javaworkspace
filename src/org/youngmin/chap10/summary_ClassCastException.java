package org.youngmin.chap10;

// 이 파일은 ClassCastException을 이해하기 위한 사전 자료이다.
// 코드가 아니라, 인터페이스와 구현 클래스 간에도 상위 클래스와 하위 클래스 간의 관계 처럼 강제 타입 변환이 가능하다는 것을 보여주기 위한 이론이므로
// 그냥 이해만 하면 된다.

public class summary_ClassCastException {

	

//	// Animal 타입 변수에 dog 객체를 대입한다.
//	// animal이 dog이기 때문에 animal을 dog로 강제 타입 변환해도 아무런 문제가 없다.
//	Animal animal = new Dog();
//	Dog dog = (Dog) animal;
//	
//	
//	// RemoteControl 타입의 변수 rc에 Television 객체를 대입했다.
//	// rc가 텔레비전이기 때문에
//	// 다시 텔레비전으로 대입할 수 있다. 아무런 문제가 없다.
//	RemoteControl rc = new Television();
//	Television tv = (Television) rc;
//	
//	
//	
//	// Animal 타입 변수 animal에 dog 객체를 대입한다.
//	// ClassCastException을 발생시키지 않기 위해서
//	// 타입 변환하기 전에 타입 변환이 가능한지 instanceof 연산자로 확인한다.
//	// instanceof 연산의 결과가 true이면
//	// 좌항 객체를 우항 타입으로 변환한다.
//	// 아래 코드에서는 instanceof의 좌항이 animal이고, 우항이 cat이다.
//	// 그러므로, 타입 변환이 가능한지 확인했을 때
//	// 
//	Animal animal = new Dog(); // animal을 dog로 만들었다.
//	if(animal instanceof Dog) { // animal과 dog를 instanceof연산하면 true가 나온다. 위에서 animal을 도그로 만들었기 떄문이다.
//		Dog dog = (Dog) animal;  // 그러므로 당연히 animal을 dog로 강제 타입 변환해도 된다.
//	} else if(animal instanceof Cat) {
//		Cat cat = (Cat) animal;
//	}
//	
//	
//	// 그러나 반대로
//	Remocon rc = new Audio(); // rc는 audo로 만든 것이다.
//	if(rc instanceof Television) { // rc를 television 과 instanceof 연산을 하면 당연히 false가 나온다. 
//		Television tv = (Television) rc; // 그러므로 당연히 audio로 만든 rc를 television으로 강제 타입 변환을 할 수가 없다.
//	} else if(rc instanceof Audio) {
//		Audio audio = (Audio) rc;
//	}
//
//}
}