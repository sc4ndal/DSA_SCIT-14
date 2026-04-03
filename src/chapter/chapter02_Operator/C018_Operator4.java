package chapter.chapter02_Operator;

public class C018_Operator4 {
	
	public static void main(String[] args) {
		
		// 논리 연산자
		// && : AND 연산자
		// || : OR 연산자
		
		int num1 = 10;
		int num2 = 20;
		boolean flag;
		
		// AND : 둘 다 TRUE 여야 TRUE
		System.out.println("=== && 연산자 ===");
		flag = (num1 > 0) && (num2 > 0);
		System.out.println("(num1 > 0) && (num2 > 0) = "+flag);
		flag = (num1 < 0) && (num2 > 0);
		System.out.println("(num1 < 0) && (num2 > 0) = "+flag);
		
		// OR : 하나라도 TRUE 면 TRUE
		System.out.println("=== || 연산자 ===");
		flag = (num1 > 0) || (num2 > 0);
		System.out.println("(num1 > 0) || (num2 > 0) = "+flag);
		flag = (num1 < 0) || (num2 > 0);
		System.out.println("(num1 < 0) || (num2 > 0) = "+flag);
	}
}
