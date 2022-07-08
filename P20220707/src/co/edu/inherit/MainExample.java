package co.edu.inherit;

public class MainExample {
	public static void main(String[] args) {
		DmbCellPhone phone = new DmbCellPhone();
		phone.setModel("anycall");
		phone.setColor("white");

		phone.powerOn();
		phone.bell();
		phone.sendVoice();
		phone.receiveVoice();

		phone.turnOn();
		phone.turnOff();

		phone.powerOff();

		// SmartPhone 기능.
		SmartPhone sphone = new SmartPhone();
		sphone.setModel("Galaxy");
		sphone.setColor("Black");

		sphone.powerOn();
		sphone.powerOff();

		System.out.println("자동형변환>>>>>>>");
		// 부모 > 자식. long <- int : 자동형변환 , int <- long : 강제형변환
		CellPhone dphone = new DmbCellPhone("iPhone","Red",100);
		CellPhone cphone = new CellPhone();
		
		System.out.println(dphone.toString());
		
		cphone.setModel("123");
		cphone.setColor("456");
		System.out.println(cphone.toString());

		if (sphone instanceof CellPhone) {
			DmbCellPhone dcp = (DmbCellPhone) dphone; // 컴파일 오류는 없지만, 실행 시 오류 발생

			dcp.powerOn();
			dcp.turnOn(); // 자식의 기능은 사용불가.
			dcp.powerOff();
		}

	}
}
