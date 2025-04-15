package ch92;

public class Main {
	public void exe(Parent parent) {	// 하나의 메소드를 가지고 상속과 오버라이딩이 뒷받침이 되어야하는데 그 두개이전에 추상화가 진행되어야한다.
		parent.work();
	}
	
	
	public static void main(String[] args) {	// 스테이틱은 클래스와 별개
		Main main = new Main();
		
		Parent parent = new Parent(); 	// 부모
		main.exe(parent);
		
		Parent parent2= new Child(); // 자식  // 다형성
		main.exe(parent2);	
		
		main.exe(new Child());	// 다형성
		
		// 클래스도 없는 자식객체 ( 일회성 객체 ) 또는 ( 익명 객체 ) 라고 한다
		Parent parent3 = new Parent() {	// 이렇게 하면 Parent 의 자식이 만들어진다.
			@Override
			void work() {
				System.out.println("밥 묵다");
			}
		};
		main.exe(parent3);
		
		// 익명객체를 더 줄여본다
		main.exe(new Parent() {	//class 익명 extends Parent // 익명객체의 변수를 만들 필요가없다
			@Override
			void work() {
				System.out.println("밥 묵다");
				
			}
		});
	}
}

class Parent {	// 하나의 파일 안에는 클래스가 1개일 필요는 없다 하지만 퍼블릭은 대표 하나만 이다
	void work() {
		System.out.println("일(직업)한다");
	}
	
}

class Child extends Parent {	// 부모( extends, implements) 자식 관계
	@Override
	void work() {
		System.out.println("공부한다");
		}
	}

