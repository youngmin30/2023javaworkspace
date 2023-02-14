package org.vision.chap08;

public class CalcTEst {
	// Functional Interface 람다식에서 활용한 예
	
	public static void main(String[] args) {
		Calculator add = (q, w) -> q + w;
		Calculator substract = (q, w) -> q-w;
		
		
		// 아래 12라인부터 18라인까지를 람다로 줄여준 것이다.
	    Calculator add2 = new Calculator() { // Calculator add2 = new Calculator() {};를 입력하면, 자동 생성 준비가 됨

			@Override
			public int calc(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}};
	    
		//================================================= 빼기
			Calculator substract2 = new Calculator() {

				@Override
				public int calc(int a, int b) {
					// TODO Auto-generated method stub
					return a-b;
				}
				
			};
			//================================================= 이 부분을 람다로 줄여준 것
	    
		
		// 
		System.out.println(add.calc(10, 5)); // 15
		System.out.println(substract.calc(10, 5)); // 5
	}

}
