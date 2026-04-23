package chapter.chapter12_Generic;

/*
	제네릭 타입 제한 - 상한선 제한
	<T extends Number>
	: Number 또는 그 하위 타입만 사용할 수 있음.
 */

class Calculator<T extends Number> {
	void show(T n) {
		System.out.println("숫자 : "+n);
	}
}
public class C104_GenericRange1 {
	public static void main(String[] args) {
		
		Calculator<Integer> c1 = new Calculator<>();
		Calculator<Double> c2 = new Calculator<>();
		
		c1.show(10);
		c2.show(3.14);
		
//		Calculator<String> c3 = new Calculator<>(); // String은 Number 를 상속받고 있지 않음
	}
}
