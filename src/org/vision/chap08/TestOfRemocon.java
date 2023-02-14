package org.vision.chap08;
// 삼성 리모콘, LG 리모콘, Audio Remocon, Aircon Remocon

public class TestOfRemocon {
	
/*
 * 
 * 
 * 
 * 
 */
	
	public static void main(String[] args) {

		// 블록을 잡고, alt를 누르고 방향키를 누르면 코드 전체를 위아래로 조절할 수 있다.
		// 익명의 이너클래스 방식으로 인터페이스를 구현한 객체를 만들 수 있다.
		Remocon audioRemocon = new Remocon() { 
			
			@Override
			public void on() {
				System.out.println("오디오에 전원이 들어왔습니다."); // 이 블록 안에 추상 메소드를 바로 붙여 넣어주었음.
				
			}
			
			@Override
			public void off() {
				System.out.println("오디오의 전원을 차단했습니다.");
				
			}
			};

		삼성리모콘 sr = new 삼성리모콘(); // 삼성리모콘은 클래스여야 함.
		
		// 폴리모피즘을 활용할 수 있음
		Remocon[] remocons = new Remocon[] { 
			new 삼성리모콘(),
			new LG리모콘(),
			new AircornRemocon(),
			new SmartPhone(),
			audioRemocon, // 9라인의 audioRemocon을 가져온 것
			sr
		
		
			};
		
			for(Remocon x:remocons) {
				x.on(); // 6개를 동시에 켜게 된다.
			}
			for(Remocon x:remocons) {
				x.off(); // 6개를 동시에 켜게 된다.
				x.message();
			}
		
	}

}