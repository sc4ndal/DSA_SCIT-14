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
		
		// NOT : true -> false , false -> true
		System.out.println("=== != 연산자 ===");
		System.out.println("!flag=" + !flag);
		
		// 단락 평가
		System.out.println("=== 단락 평가 ===");
		int num = 10, i = 2;
		// 앞이 false면 AND 연산자 && 는 뒤는 실행하지 않음
		System.out.println("=== && 연산자 ===");
		boolean value = ((num = num + 10) < 10) && ((i = i + 2) < 10);
		System.out.println("value : " + value);
		System.out.println("num : " + num);
		System.out.println("i : " + i);
		
		num = 10;
		i = 2;
		
		// 앞이 true면 OR 연산자 || 는 뒤는 실행하지 않음
		System.out.println("=== || 연산자 ===");
		value = ((num = num + 10) > 10) || ((i = i + 2) < 10);
		System.out.println("value : " + value);
		System.out.println("num : " + num);
		System.out.println("i : " + i);
	}
}
