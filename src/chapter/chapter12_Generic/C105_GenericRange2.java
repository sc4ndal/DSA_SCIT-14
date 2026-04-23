package chapter.chapter12_Generic;

/*
	[다중 타입 한정]
	<T extends A & G>
	
	-> 제네릭 타입 T는
		A 타입으로도 표현 가능해야 하고,
		B 타입으로도 표현 가능해야 한다.
		
	즉, 두 인터페이스를 모두 구현한 클래스만 사용 가능하다.
 */

interface Printable {
	void print();
}

interface Savale {
	void save();
}

class Printer implements Printable, Savale {
	@Override
	public void print() {
		System.out.println("문서를 출력합니다.");
	}
	
	@Override
	public void save() {
		System.out.println("문서를 저장합니다.");
	}
}

class Monitor implements Printable {
	@Override
	public void print() {
		System.out.println("화면에 표시합니다.");
	}
}
// extends Printable + Savable 두 조건을 모두 만족하는 타입만 받을 수 있다.
class Device<T extends Printable & Savale> {
	void use(T item) {
		item.print();
		item.save();
	}
}


public class C105_GenericRange2 {
	public static void main(String[] args) {
		// Printer는 두 인터페이스를 모두 구현했으므로 가능
		Device<Printer> dv = new Device<>();
		dv.use(new Printer());
		
		// Savale를 구현하지 않았으므로 에러
//		Device<Monitor> monitor = new Device<Monitor>();
	}
}
