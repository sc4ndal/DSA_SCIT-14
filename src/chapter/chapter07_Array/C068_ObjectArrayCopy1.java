package chapter.chapter07_Array;

import java.util.Arrays;

public class C068_ObjectArrayCopy1 {
	public static void main(String[] args) {
		//얕은 복사
		Book[] book1 = {
				new Book("태백산맥", "조정래"),
				new Book("데미안", "헤르만 헤세"),
				new Book("자바", "홍길동"),
		};
		
		Book[] book2 = new Book[3];
		
		// book1의 값을 book2로 복사
		for (int i = 0; i < book1.length; i++) {
			book2[i] = book1[i];
		}
		//book1의 인스턴스들을 하나씩 꺼내 메서드 실행
		System.out.println("===book1 출력 ===");
		for (Book b : book1) {
			b.showInfo();
		}
		//book2의 인스턴스들을 하나씩 꺼내 메서드 실행
		System.out.println("=" +
				"==book2 출력 ===");
		for (Book b : book2) {
			b.showInfo();
		}
		
		System.out.println("===같은 객체를 참조하는지 확인 ===");
		System.out.println(book1[0]==book2[0]?"같은 객체 참조":"다른 객체 참조");
		
		book2[0].title="토지";
		
		//book1의 인스턴스들을 하나씩 꺼내 메서드 실행
		System.out.println("===book1 출력 ===");
		for (Book b : book1) {
			b.showInfo();
		}
		//book2의 인스턴스들을 하나씩 꺼내 메서드 실행
		System.out.println("===book2 출력 ===");
		for (Book b : book2) {
			b.showInfo();
		}
	}
}
