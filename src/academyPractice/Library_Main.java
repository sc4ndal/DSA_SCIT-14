package academyPractice;

import java.util.Scanner;

public class Library_Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Library_Service ls = new Library_Service();
		
		while (true) {
			ls.mainMenu();
			int num = sc.nextInt();
			switch (num) {
				case 1 -> ls.insertBook();
				case 2 -> ls.serachTitle();
				case 3 -> ls.searchAuthor();
				case 4 -> ls.searchPrice();
				case 5 -> ls.searchAll();
				case 0 -> System.exit(0);
				default -> System.out.println("**다시 선택해주세요**");
			}
		}
	}
}
