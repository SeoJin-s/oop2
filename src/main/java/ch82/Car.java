package ch82;

import java.util.ArrayList;

public class Car {
	public ArrayList<Tire> list;
	
	public void move() {
		for (Tire t : this.list) {
			t.roll();
		}
	//필드의 다형성을 사용
	
	/*
	public ArrayList<HankookTire> tire;
	public ArrayList<KumhoTire> tire2;
	public ArrayList<NexenTire> tire3;
	*/
}
}