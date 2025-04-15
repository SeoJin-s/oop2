package ch101;

// 예외처리	트라이 캐치를 안쓰고 던져도 상관은 없다.
public class Main {
	public static void main(String[] args)	{
		try {
			System.out.println("helle");
		} catch (Exception e){
			System.out.println("예외발생");
			return;
			// e.pirntStackTrace();
			// 예외가 발생했을때 조치해야할 내용
		} finally {
			System.out.println("bye");
		}
		
	}
}
		/*
		
		public class Main {
			public static void main(String[] args)	{
				System.out.println("helle"); 	// 모든 코드는 예외를 발생 시킬 수 있다.
				try {
					System.out.println(5/0);
				} catch(Exception e) {
					System.out.println("0으로 나눌수 없습니다");
			}
		
		*/