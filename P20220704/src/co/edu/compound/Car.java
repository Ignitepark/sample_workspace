package co.edu.compound;

/*
 * 자동차(Object)를 Java 세계로 옮겨 놓은 것이 Class
 */
public class Car {
	// 속성 : 필드.
	String model;
	int price;
	int maxSpeed;
	int speed;
	double weight;
	double width;
	double length;
	double height;

	// 생성자 : 필드의 초기값을 지정.
	public Car() {
		System.out.println("생성자 호출.");
		maxSpeed = 200;
	}

	public Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

	// 동작 : 메소드
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void showSpeed() {
		System.out.println("현재 속도는 " + speed + "km/h 입니다.");
	}

	public void run() {
		System.out.println(model + "가 달립니다.");
	}

	public void start() {
		System.out.println(model + "가 출발합니다.");
	}

	public void stop() {
		System.out.println(model + "가 멈춥니다.");
	}

}
