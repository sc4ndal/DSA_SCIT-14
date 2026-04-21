package chapter.chapter10_Abstraction;

/*
	[추상 클래스 + 인터페이스 + 다중구현]
	1. 클래스는 단일 상속만 가능
	2. 인터페이스는 여러개 구현 가능
	3. 상속과 구현을 동시에 사용 가능
	4. 인터페이스끼리 다중 상속 가능
 */
// 추상 클래스
abstract class Device {
	void powerOn() {
		System.out.println("전원을 켠다.");
	}
	void powerOff() {
		System.out.println("전원을 끈다.");
	}
}

// 일반 클래스
class Phone extends Device {
	void call() {
		System.out.println("전화를 건다.");
	}
	void receive() {
		System.out.println("전화를 받는다.");
	}
}

// 인터페이스
interface Camera {
	void takePicture();
}
interface Game {
	void playGame();
}

// 상속 + 다중 구현
class SmartPhone extends Phone implements Camera, Game {
	@Override
	public void takePicture() {
		System.out.println("찰칵, 사진을 찍는다.");
	}
	@Override
	public void playGame() {
		System.out.println("게임을 실행한다.");
	}
}

public class C085_MultiInheritance {
	public static void main(String[] args) {
		SmartPhone iPhone = new SmartPhone();
		iPhone.powerOn();
		iPhone.call();
		iPhone.receive();
		iPhone.takePicture();
		iPhone.playGame();
		iPhone.powerOff();
		System.out.println("=================");
		
		// 타입의 다형성
		Camera cam = new SmartPhone();
		Game game = new SmartPhone();
		
		cam.takePicture();
		game.playGame();
	}
}

// 인터페이스
interface A {}
interface B {}

// 클래스 상속 + 인터페이스 다중 구현
class C{}
class D extends C implements A,B{}

// 인터페이스끼리 다중 상속 가능 -> 인터페이스 끼리는 extends / class는 extends 사용하면 하나 밖에 상속 불가
interface E extends A,B {}
