package org.vision.chap08;

public class LG리모콘 implements Remocon {

	@Override
	public void on() {
		System.out.println("LG TV에 전원이 들어왔습니다.");
		
	}

	@Override
	public void off() {
		System.out.println("LG TV에 전원이 들어왔습니다.");
		
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
