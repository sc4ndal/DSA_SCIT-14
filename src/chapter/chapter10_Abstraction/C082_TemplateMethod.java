package chapter.chapter10_Abstraction;

abstract class Car {
	public abstract void drive();
	public abstract void stop();
	static int a;
	
	private void turnOn() {
		System.out.println("시동을 켭니다.");
	}
	private void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// template method
	final public void run() {
		turnOn(); 	// private
		drive(); 	// abstract
		stop(); 	// abstract
		turnOff(); 	// private
	}
	
}

class AICar extends Car {
	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 알아서 방향을 전환합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
	}
}

class ManualCar extends Car {
	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}
	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.");
	}
}

public class C082_TemplateMethod {
	public static void main(String[] args) {
		// 추상클래스를 이용한 템플릿 메서드
		System.out.println("=== 자율 주행하는 자동차 ===");
		Car car1 = new AICar();
		car1.run();
		System.out.println();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car car2 = new ManualCar();
		car2.run();
	}
}

abstract class AA {
	abstract void methodA();
	abstract void methodB();
}

abstract class BB extends AA {
	@Override
	void methodA() {
	
	}
}

class CC extends BB {
	@Override
	void methodB() {
	
	}
}

abstract class DD {

}

class EE extends DD {

}
