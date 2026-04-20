package practice.chapter07_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Example06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("받을 로또 게임의 개수를 입력해주세요: ");
		int lotto = sc.nextInt();
		int count = 1;
		System.out.println("==============================");
		
		while (count <= lotto) {
			int[] lottos = new int[6];
			// 난수 6개 배열에 저장
			for (int i = 0; i < lottos.length; i++) {
				lottos[i] = (int) (Math.random() * 45 + 1);
				
				// 중복제거
				for (int j = 0; j < i; j++) {
					if (lottos[i] == lottos[j]) {
						i--;
						break;
					}
				}
				
			}
			
			Arrays.sort(lottos);
			
			// 출력
			System.out.printf("*[%2d ]번 : ", count);
			for (int i = 0; i < lottos.length; i++) {
				System.out.printf("%2d ", lottos[i]);
			}
			System.out.println();
			count++;
		}
	}
}
