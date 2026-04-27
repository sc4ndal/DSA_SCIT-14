package chapter.chapter01_Data;

public class C007_Constant {
	
	public static void main(String[] args) {
		
		/*
		[상수]
		1. 한번 값이 저장되면 변경할 수 없는 *변수*
		2. final 선언
		3. 일반 변수와 구분하기 위해 대부분 대문자_ 로 작성
		ex.ex. PI, MAX_SIZE, TAX,RATE
		 */
		
		final double a = 3.14;
		System.out.println(a);
//		a = 10; //변경불가
	
		final double RATE =  3.28;
		int deposit = 10000;
		double sum = 0;
		sum = deposit+deposit*RATE/100;
		System.out.println("이자율 : "+RATE+"%");
		System.out.println("1년 후 이자 : "+deposit*RATE/100+"원");
		System.out.println("1년후 재산 : "+sum);
		
		/*
		[리터럴]
		상수 이외 프로그램에서 직접 작성한 값 그 자체
		변수에 저장되거나 수식에 바로 사용
		 */
		
		final double PI = 3.14; // PI : 상수, 3.14 : 리터럴
		int number = 10000; // 10000:리터럴
		String name = "홍길동"; // 홍길동:리터럴
		
	
	}
}
