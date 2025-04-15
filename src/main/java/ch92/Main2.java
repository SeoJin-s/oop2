package ch92;

public class Main2 {
	public static void main(String[] args) {
		Main2 main2 = new Main2();
	//람다식
		main2.exe((name)-> System.out.println(name +"공부하다")); // 기능만 넘길때 사용하는 문법 - 람다식 ( Lambda )
		// @FunctionalInterface 이 인터페이스가 람다식에 적합한 구조(메서드 1개만) 인지 컴파일러가 검증
		

	
	// 익명객체
	 main2.exe(new IParent() {
			@Override
			public void work(String name) {
				System.out.println(name+"이 공부하다");
			}
		
		});
		
	}

	public void exe(IParent parent) {
		parent.work("구디");
		}
	} 
	@FunctionalInterface	// 인터페이스지만 함수처럼 쓰겠다. 단일 함수만 갖는다.
	interface IParent {
		void work(String name);
	}