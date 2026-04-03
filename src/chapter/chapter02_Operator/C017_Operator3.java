package chapter.chapter02_Operator;

public class C017_Operator3 {
	
	public static void main(String[] args) {
		
		//증감 연산자(변수++,++변수,변수--,--변수)
		int value = 2;
		int a = ++value;
		System.out.println("value=" + value + ",a=" + a);
		
		value = 2;
		a = value++;
		System.out.println("value=" + value + ",a=" + a);
		
		value = 2;
		a = --value;
		System.out.println("value=" + value + ",a=" + a);
		
		value = 2;
		a = value--;
		System.out.println("value=" + value + ",a=" + a);
		
		// 부호 연산자(+,-)
		int value2 = 8;
		System.out.println("부호 변경 전 : " + value2);
		value2 = -value2;
		System.out.println("부호 변경 후 : " + value2);
		value2 = -value2;
		System.out.println("부호 재변경 후 : " + value2);
		
		// 문자열 연결 연산자(+)
		System.out.println("영구와" + "땡칠이");
		System.out.println("응답하라" + 19 + 98);
		System.out.println(19 + 88+"응답하라");
		System.out.println(""+19 + 88+"응답하라");
		
	}
}
