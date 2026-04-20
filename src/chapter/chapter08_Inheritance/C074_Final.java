package chapter.chapter08_Inheritance;

/*
	[final] => 변경 불가
	1. final parameter => 값 변경 X (상수)
	2. final method => 자식클래스에서 오버라이딩 X
	3. final class => 상속 불가 클래스
 */

final class FinalVehicle {
	void info() {
		System.out.println("final class");
	}
}

//class Truck extends FinalVehicle { } // 오류 (상속 불가)

class Vehicle {
	final int MAX_SPEED = 120;
	
	final void move() {
		System.out.println("vehicle 이동");
	}
}

class Car extends Vehicle {
//	@Override
//	void move() { => final method 라서 재정의 불가
//		System.out.println("재정의");
//	}
	void drive() {
		System.out.println("Car 운전");
	}
}

public class C074_Final {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.move();
		car1.drive();
//		car1.MAX_SPEED = 100; => final 변수라 변경 불가
		System.out.println("MAX_SPEED : "+car1.MAX_SPEED);
	}
	
}
