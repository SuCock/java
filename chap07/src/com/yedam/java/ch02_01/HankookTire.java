package com.yedam.java.ch02_01;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
		public boolean roll() {
			++accumlatedRotaiton;
			if (accumlatedRotaiton < maxRotation) {
				System.out.println(location + "HankookTire 수명 : " + (maxRotation - accumlatedRotaiton) + "회");
				return true;
			} else {
				System.out.println("*** " + location + "HankookTire 펑크 ***");
				return false;
			}
		
	}

}
