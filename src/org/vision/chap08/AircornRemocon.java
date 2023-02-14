package org.vision.chap08;

public class AircornRemocon implements Remocon { // AircornRemocon 이름에 밑줄이 그어져 있으면, 구상화 시켜야 하는 부분이 있다는 것을 알려 주는 것이다.

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("에어컨이 작동합니다.");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("에어컨의 전원이 차단됩니다.");
		
	}

	@Override
	public void volumeUp(int x) {
		// TODO Auto-generated method stub
		System.out.println("소리를 높입니다.");
		
	}

	@Override
	public void volumeDown(int x) {
		System.out.println("소리를 낮춥니다.");
		
	} 
	
}
