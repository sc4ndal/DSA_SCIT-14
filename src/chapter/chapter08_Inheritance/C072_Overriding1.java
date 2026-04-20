package chapter.chapter08_Inheritance;

/*
	[method overrindg]
	상속 관계에 있을 경우, 부모클래스의 메서드를 자식클래스에서 재정의하는 것.
	
	[오버라이딩 조건]
	1. 상속관계에서만 가능
	2. 메서드 이름이 같아야 함.
	3. 매개변수 타입, 개수, 순서가 같아야 함.
	4. 리턴 타입이 같아야함.
	5. 접근제어자는 부모와 같거나 더 넓어야 한다.
	
 */

class AA {
	public void method() {
		System.out.println("부모 클래스의 method()");
	}
}

class BB extends AA {
	@Override
	public void method() {
//		super.method();
		System.out.println("자식 클래스의 method()");
	}
}

public class C072_Overriding1 {
	public static void main(String[] args) {
		// 다형적 변수
		// 참조타입 / 생성타입
		// 메서드의 호출은 생성타입을 따라감. <- 메서드 오버라이딩
		AA aa = new AA();
		BB bb = new BB();
		AA ab = new BB();
		
		System.out.println();
		
		System.out.println("aa");
		aa.method();
		System.out.println("bb");
		bb.method();
		System.out.println("ab");
		ab.method();
		
	}
}
