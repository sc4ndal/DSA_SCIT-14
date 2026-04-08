package chapter.chapter04_Loop;

public class C036_Break {
	public static void main(String[] args) {
		
		/*
		[break]
		- 가장 가까운 반복문 하나 즉시 종료
		- switch문에서도 사용
		- 중첩 반복문에서 사용하면, 자신을 감싸고 있는 안쪽 반복문만 종료
		 */
		
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				break;
			}
			System.out.println("반복회차"	+ i);
		}
		
		System.out.println("\n=== 중첩 반복문에서 break===");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <5; j++) {
				if (i == 3 && j == 3) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n=== 중첩 반복문에서 break===");
		// label을 사용하면 원하는 바깥 반복문까지 종료
		loop: // break를 만나서 여기까지 나옴
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <5; j++) { // 원래 여기까지 나옴
				if (i == 3 && j == 3) {
					break loop;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
