package Service;

public class OttTv implements ITv {
	// 중간에 통신하는 접점역활 ( interface) 이 없다면
	@Override
	public void onOff() {
		System.out.println("Ott 서비스에 로그인 확인");
		System.out.println("서비스 시작 TV ON");
	}

}
