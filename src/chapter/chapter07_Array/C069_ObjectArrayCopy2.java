package chapter.chapter07_Array;

import java.util.Arrays;

public class C069_ObjectArrayCopy2 {
	public static void main(String[] args) {
		// 깊은 복사
		Book[] books1 = {
				new Book("태백산맥", "조정래"),
				new Book("데미안", "헤르만 헤세"),
				new Book("자바", "홍길동"),
		};
		
		Book[] books2 = new Book[3];
		for (int i = 0; i < books1.length; i++) {
			books2[i] = new Book(books1[i].title, books1[i].author);
		}
		System.out.println("=== books1 ===");
		for (Book b : books1) {
			b.showInfo();
		}
		System.out.println("=== books2 ===");
		for (Book b : books2) {
			b.showInfo();
		}
		
		System.out.println(books1[0] == books2[0]);
		System.out.println(Arrays.deepEquals(books1,books2));
		
		books2[0].title = "토지";
		
		System.out.println("=== books1 ===");
		for (Book b : books1) {
			b.showInfo();
		}
		System.out.println("=== books2 ===");
		for (Book b : books2) {
			b.showInfo();
		}
		
	}
}
