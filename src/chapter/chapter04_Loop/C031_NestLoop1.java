package chapter.chapter04_Loop;

public class C031_NestLoop1 {
	public static void main(String[] args) {
		//구구단
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
		
		//for 가로 ver.
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + j*i+"\t");
			}
			System.out.println();
		}
	}
}
