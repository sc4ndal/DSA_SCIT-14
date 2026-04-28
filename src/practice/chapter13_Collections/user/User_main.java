package practice.chapter13_Collections.user;

import java.util.Scanner;

public class User_main {
	public static void main(String[] args) {
		// 모든 실행은 main에서 시작
		Scanner sc = new Scanner(System.in);
		
		User_method um = new User_method();
		
		int num = 0;
		um.abc();
		while (true) {
			um.printMenu();
			num = sc.nextInt();
			switch (num) {
				case 1 -> um.createUser();
				case 2 -> um.selectUser();
				case 3 -> um.selectAll();
				case 4 -> um.editQ();
				case 0 -> System.exit(0);
				default -> um.errorMesseage(1);
				
			}
			
		}
		
	}
}
