package org.vision.chap08;
// 옆 인터페이스가 가지는 추상 메소드 부분을 이 클래스에서 구상화(Concrete)
// 옆에 있는 Remocon 인터페이스의 추상 메소드 부분을, 이 인터페이스 만드는 것을 구상화라고 한다.
public class 삼성리모콘 implements Remocon {
	
	@Override
	public void on() {
		System.out.println("삼성 TV에 전원이 들어왔습니다.");
	} // 하나 구상화했음
	
	@Override
	public void off() {
		System.out.println("삼성 TV의 전원을 차단합니다.");
	}

	@Override
	public void volumeUp(int x) {
		System.out.println("소리를 높입니다.");
		
	}

	@Override
	public void volumeDown(int x) {
		System.out.println("소리를 낮춥니다.");
		
	}


	

}
