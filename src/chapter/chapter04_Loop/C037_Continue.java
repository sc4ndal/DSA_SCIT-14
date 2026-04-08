package chapter.chapter04_Loop;

public class C037_Continue {
	public static void main(String[] args) {
		
		// continue
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				continue; // 이 조건식만 넘어가고 다음 실행
			}
			System.out.println("반복회차 : " + i);
		}
		
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
//				System.out.println("점프!");
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}
}
