package practice.chapter00_basic;

import java.util.Scanner;

public class Basic_Example02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		double height;
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.print("키를 입력하세요 : ");
		height = sc.nextDouble();
		
		System.out.println("======================================");
		System.out.println("이름은 "+name+"이고 나이는 "+age+"세, 키는 "+height+"Cm입니다");
	
	}
}
