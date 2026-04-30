package academy;

import java.util.Scanner;

public class DSA_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DSA_Service dsaService = new DSA_Service();
		
		while (true) {
			dsaService.mainMenu();
			int num=sc.nextInt();
			
			switch (num) {
				case 1 -> dsaService.insertStudent();
				case 2 -> dsaService.updateScore();
				case 3 -> dsaService.selectStudent();
				case 4 -> dsaService.selectAll();
				case 5 -> dsaService.selectRank();
				case 0 -> {
					System.exit(0);
				}
				default -> System.out.println("** 다시 선택하세요. **");
			}
		}
	}
}
