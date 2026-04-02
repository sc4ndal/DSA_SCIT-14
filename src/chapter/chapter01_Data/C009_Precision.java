package chapter.chapter01_Data;

public class C009_Precision {
	
	public static void main(String[] args) {
		
		/*
		[정밀도]
		컴퓨터는 숫자를 bit로 저장
		메모리 크기가 제한돼 있기 때문에 모든 실수를 정확하게 표현 x
		*실수형 데이터는 표현 가능한 자리수(정밀도)가 존재
		 */
		
		// float - 4byte(32bit), 약 7자리 정밀도
		float value = 0.123456789f;
		float value2 = 12345.123456789f;
		System.out.println("float : "+value);
		System.out.println("float2 : "+value2);
		
		// double - 8byte(64bit), 약 15자리 정밀도
		double value3 = 12345.1234567890123456789;
		System.out.println(value3);
		
		//오차
		double num1 = 0.1;
		double num2 = 0.2;
		System.out.println(num1+num2);
		
	}
}
