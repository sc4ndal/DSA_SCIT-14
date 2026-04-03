package chapter.chapter02_Operator;

import java.util.Scanner;

public class C019_Operator5 {
	
	public static void main(String[] args) {
		
		// 삼항 연산자(=조건 연산자)
		// 조건식 ? true : false
		
		int fatherAge,motherAge;
		String result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아빠 입력:");
		fatherAge = sc.nextInt();
		System.out.print("엄마 입력:");
		motherAge = sc.nextInt();
		
//		int fatherAge = 45;
//		int motherAge = 47;
		
//		if(fatherAge==motherAge){
//			System.out.println("동갑");
//		}else{
//			result = fatherAge > motherAge?
//					"아빠가 연상" : "엄마가 연상";
//			System.out.println(result);
//		}
		
		result = fatherAge > motherAge ?
				"아빠가 연상" : fatherAge == motherAge ?
				"동갑" : "엄마가 연상";
		System.out.println(result);
	
	}
}
