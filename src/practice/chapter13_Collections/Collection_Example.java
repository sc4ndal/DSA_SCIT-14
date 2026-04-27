package practice.chapter13_Collections;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Collection_Example {
	private static final int LOTTO_COUNT = 6;
	private static final int MAX_NUMBER = 45;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		TreeSet<Integer> lottos = new TreeSet<>();
		int count = 1;
		
		System.out.print("갯수 입력 : ");
		int num = sc.nextInt();
		System.out.println("===============================================================");
		while (count <= num) {
			while (lottos.size() < count) {
				int ranNum = ran.nextInt(MAX_NUMBER) + 1;
				lottos.add(ranNum);
			}
//			for (int i = 0; i < num; i++) {
//				for (int j = 0; j < LOTTO_COUNT; j++) {
//
//				}
//			}
			System.out.printf("*오늘의 행운 번호 [%2d ] : ", count);
			for (int i : lottos) {
				System.out.printf("%2d ", i);
			}
			System.out.println();
			count++;
		}
	}
	
}
