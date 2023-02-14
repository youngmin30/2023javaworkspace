package org.vision.chap08;
// 삼성 리모콘, LG리모콘, Audio Remocon, AirCon Remocon
public interface Remocon { // 인터페이스로 적어도 온오프 기능 구현해보기
	String SIZE = "78*200mm"; { // 이 리모콘은 가로 78 * 세로 200 밀리미터이다.
	void on(); // public abstract
	void off();
	void volumeUp(int x);
	void volumeDown(int x); // 다른 클래스들에서 구현을 안 해준 채로, run 하면 전체 다 오류가 난다.
	
	// 일일이 구현 객
	// 만드는 법
	default void message() {
		System.out.println("이 메시지는 인터페이스의 default메소드에서 제공합니다."); // 내용 너무 신경 쓰지 말 것 일단
	}
	static String getVersion() {
		return "Sun's Remocon ver 1.2";
	}
	
}

/*
* default와 staic을 제외하고는 전부 추상 메소드이다.
*
*
*
*
*/