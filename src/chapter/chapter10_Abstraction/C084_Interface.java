package chapter.chapter10_Abstraction;

/*
	[인터페이스] - interface
	인터페이스는 클래스가 구현해야 하는 기능의 규칙(설계도)이다.
	
	특징
		1. 객체를 직접 생성할 수 없다.
		2. implemnts 키워드로 구현.
		3. 인터페이스 변수는 자동으로 public static final 상수가 된다.
		4. 인터페이스 메서드는 자동으로 public abstract 메서드가 된다.
		5. java8 부터는 default 메서드와 static 메서드를 사용할 수 있다.
		(구현부가 존재)
		6. 인터페이스 타입으로 다형성을 표현할 수 있다.(타입 상속)
 */

interface Calc {
	double PI = 3.14; // 인터페이스 변수는 자동 public static final
	
	// 추상 메서드
	int plus(int a, int b);
	int minus(int a, int b);
	
	// default 메서드
	default void description() {
		System.out.println("계산기 인터페이스입니다.");
	}
	
	// static 메서드
	static int total(int[] arr) {
		int sum = 0;
		for (int n : arr) {
			sum+=n;
		}
		return sum;
	}
	
}

class BasicCalc implements Calc {
	@Override
	public int plus(int a, int b) {
		return a+b;
	}
	
	@Override
	public int minus(int a, int b) {
		return a-b;
	}

}

public class C084_Interface {
	public static void main(String[] args) {
		Calc calc = new BasicCalc();
//		Calc.description(); // static이 아니라서 생성자 없이 불가 메서드
		calc.description();
//		Calc.PI = 10.10; // PI는 인터페이스 변수인 final이라 변경 불가
		System.out.println("PI : "+Calc.PI);
		System.out.println("plus : "+calc.plus(10, 5));
		System.out.println("minus : "+calc.minus(10, 5));
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr)); // total은 static 메서드로 인터페이스로 호출가능
		
	}
}
