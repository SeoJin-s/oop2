import Service.Car;
import Service.NetflixCar;

public class CarMain {

	public static void main(String[] args) {
		// 서로 통신하는 접점 역활은 인터페이스 ( interface ) 가 아니어도 되는데????
		Car c = new NetflixCar();
		c.on();

	}

}
