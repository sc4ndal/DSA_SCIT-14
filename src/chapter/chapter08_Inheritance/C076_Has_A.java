package chapter.chapter08_Inheritance;

/*
	[HAS-A 관계]
	객체가 다른 객체를 포함하고 있는 관계
	
 */

class CPU {
	String model;
	
	CPU(String model) {
		this.model = model;
	}
	void process() {
		System.out.println(model+" CPU가 연산을 수행합니다.");
	}
}

class Computer {
	String name;
	CPU cpu; // computer has CPU
	
	public Computer(String name, CPU cpu) {
		this.name = name;
		this.cpu = cpu;
	}
	
	void run() {
		System.out.print(name + " 컴퓨터에서 ");
		cpu.process();
	}
}

public class C076_Has_A {
	public static void main(String[] args) {
		CPU cpu = new CPU("Intel i7");
		
		Computer com = new Computer("사무용 PC", cpu);
		
		com.run();
	}
}
