package co.edu.interfaces;

public class FlyMain {
	public static void main(String[] args) {
		Flyer flier1 = new Helicopter(); // Flyer라는 인터페이스를 구현하는 Class로서 Helicopter가 존재. Flyer라는 인터페이스를 가진 클래스들을 호출하는 것이 가능.
		flier1.takeOff();
		flier1.fly();
		flier1.land();
		flier1 = new Airplane();
		flier1.takeOff();
		flier1.fly();
		flier1.land();
		
	}
}
