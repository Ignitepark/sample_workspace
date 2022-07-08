package co.edu.interfaces;

public class Airplane implements Flyer {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("비행기가 이륙합니다.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("비행기가 비행합니다.");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("비행기가 착륙합니다.");
	}
	
}
