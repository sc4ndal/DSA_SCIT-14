package chapter.chapter00_basic;

public class C004_VariableAssignment {
	public static void main(String[] args) {
		
		// 변수 선언
		int number; // 정수형 데이터 저장
		// 선언만 하고 초기화 안 하면 출력 불가
//		System.out.println(number); <- 출력안됨
		String name = null;
		name = "홍길동";
		System.out.println(name);
		
		// 변수 초기화
		int number2 = 100;
		number2 = 200;
		System.out.println(number2);
		
		// 다른 변수에 값 대입
		number = number2;
		System.out.println(number);
		
		// 변수 값 계산
		int sum = number + number2;
		System.out.println("number+number2="+sum);
	}
}
