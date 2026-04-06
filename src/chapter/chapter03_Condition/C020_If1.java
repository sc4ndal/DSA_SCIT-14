package chapter.chapter03_Condition;

import java.util.Scanner;

public class C020_If1 {
	public static void main(String[] args) {
		// 1. 조건문 if - 조건식이 true 일 경우 실행
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		boolean result = age>=19;
		if(result){
			System.out.println("성인입니다.");
		
		}else{
			// 2. else - if 조건이 false 값일 때 실행
			System.out.println("미성년자입니다.");
		}
		
		// 3. if - else if - else
		if (age >= 19){
			System.out.println("성인입니다.");
		} else if (age >12) { // 13~18
			System.out.println("청소년입니다.");
		}else { // ~12
			System.out.println("어린이입니다.");
		}
		
		// 4. if - else if <- else 안 씀
		if(age>=19){
			System.out.println("성인입니다.");
			
		} else if (age>12) {
			System.out.println("청소년입니다.");
			
		} else if (age>5) {
			System.out.println("유아입니다.");
			
		}
	}
}
