package chapter.chapter12_Generic;

/*
	제네릭 메서드
	- 메서드 안에서만 사용할 타입을 따로 선언하는 문법
	- <T>는 타입 매개변수 : "이 메서드에서 사용할 타입 변수 T를 선언한다" 는 뜻
 */

public class C102_GenericMethod1 {
	public static void main(String[] args) {
		
		printData("Hello");		// T -> String
		printData(10);			// T -> Integer
		printData(3.14);		// T -> Double
		
		String str = getData("사과");
		int num = getData(10);
		System.out.println("반환값: "+str);
		System.out.println("반환값: "+num);
	
	}
	public static <T> void printData(T data) {
		System.out.println("data : "+data);
	}
	public static <T> T getData(T data) {
		
		return data;
	}
}
