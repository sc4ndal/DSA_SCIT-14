package chapter.chapter08_Inheritance;

class Battery {
	String brand;
	
	Battery(String brand) {
		this.brand = brand;
	}
	
	void supplyPower() {
		System.out.println(brand+" 배터리가 전원을 공급합니다.");
	}
}

class Screen {
	void display() {
		System.out.println("화면에 내용을 출력합니다.");
	}
}

class SmartPhone {
	String model;
	Battery battery;
	Screen screen;
	
	public SmartPhone(String model, Battery battery) {
		this.model = model;
		// Aggregation(약한 소유) - 외부에서 전달 받음
		this.battery = battery;
		// Composition(강한 소유) - 스마트폰이 만들어질 때 함께 생성
		this.screen = new Screen();
	}
	void turnOn() {
		System.out.println("===" + model + " 스마트폰 실행===");
		battery.supplyPower();
		screen.display();
	}
}
public class C077_Has_A2 {
	public static void main(String[] args) {
		Battery apple = new Battery("Apple");
		SmartPhone p1 = new SmartPhone("iPhone 16Pro", apple);
		p1.turnOn();
		
	}
}
