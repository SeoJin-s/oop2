import Service.ITv;
import Service.OttTv;
import Service.SmartTv;

public class Main {
	
	public static void main(String[] args) {
		ITv tv;  // 부모
		tv = new SmartTv();	// 자식
		// 추상 클래스 객체 X, interface 객체 X
		// 부모타입 ( 클래스, 추상클래스, 인터페이스) 에 자식객체를 대입한다 
		// 그것을 다형성 이라고 한다.
		// 객체와 객체를 통신할때 인터페이스를 사용 
		
		tv.onOff(); 
		// ITv를 통해서 SmartTv의 onOff 를 호출 ( 접점 역활 )
		
		 
		// 중간에 통신하는 접점역활 ( interface) 이 없다면
		SmartTv stv = new SmartTv();
		stv.onOff();

	}
}	
