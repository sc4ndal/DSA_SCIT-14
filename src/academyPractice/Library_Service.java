package academyPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Library_Service {
	private static ArrayList<Book> booksList;
	private static Scanner sc;
	
	public Library_Service() {
		booksList = new ArrayList<>();
		sc = new Scanner(System.in);
	}
	
	public void mainMenu() {
		System.out.println("""
				DSA 서점에 오신 것을 환영합니다.
				1. 도서등록
				2. 책제목으로 검색
				3. 작가이름으로 검색
				4. 가격으로 검색(~ 금액 까지)
				5. 전체 검색
				0. 종료""");
		System.out.print("선택 > ");
	}
	
	public void insertBook() {
		System.out.println("[도서등록]");
		
		System.out.print("제목 입력 : ");
		String title = sc.next();
		
		System.out.print("작가명 입력 : ");
		String author = sc.next();
		
		System.out.print("가격 입력 : ");
		int price = sc.nextInt();
		
		Book book = new Book(title, author, price);
		booksList.add(book);
		
	}
	
	public void serachTitle() {
		System.out.println("[제목으로 검색]");
		System.out.print("제목 입력 : ");
		String title = sc.next();
		
		boolean found = false;
		
		for (Book b : booksList) {
			if (b.getTitle().equals(title)) {
				System.out.println(b);
				found = true;
			}
		}
		
		if (!found) {
			System.out.printf("%s 제목의 책의 정보가 없습니다.");
		}
	}
	
	public void searchAuthor() {
	}
	
	public void searchPrice() {
	}
	
	public void searchDate() {
	}
	
	public void searchAll() {
	}
	
}
