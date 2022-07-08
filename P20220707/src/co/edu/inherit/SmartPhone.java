package co.edu.inherit;

/*
 * CellPhone <- DmbCellPhone <- SmartPhone
 */
public class SmartPhone extends DmbCellPhone {

	public SmartPhone() {
		
	}
	public SmartPhone(String model, String color, int channel) {
		super(model, color, channel);
	}
}
