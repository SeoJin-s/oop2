package ch82;

import java.util.ArrayList;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car();
		c.list = new ArrayList<Tire>();
		Tire frontRightTire = new HankookTire();
		c.list.add(frontRightTire);
		Tire frontLeftTire = new HankookTire();
		c.list.add(frontLeftTire);
		Tire backRightTire = new NexenTire();
		c.list.add(backRightTire);
		Tire backLeftTire = new KumhoTire();
		c.list.add(backLeftTire);
		c.move();
	}
}
