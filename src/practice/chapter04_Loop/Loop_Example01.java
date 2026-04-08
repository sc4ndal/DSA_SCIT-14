package practice.chapter04_Loop;

public class Loop_Example01 {
	public static void main(String[] args) {
		// 0 1 2 3 4 5 6 7 8 9
		for (int i = 0; i < 10 ; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		// 1 2 3 4 5 6 7 8 9 10
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		// 1 3 5 7 9
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.print(i+"\t");
		}
		System.out.println();
		
//		for (int i = 0; i <= 10; i++) {
//			if (i % 2 != 0) {
//				continue;
//			}
//			System.out.print(i+"\t");
//			System.out.println();
//		}
		// == 위 아래 결과 같음
		// 0 2 4 6 8 10
		for (int i = 0; i <= 10; i+=2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
//		int i=0;
//		do {
//			i = i+10;
//			System.out.print(i+"\t");
//		}while (i<100);
		// 10 20 30 40 50 60 70 80 90 100
		for(int i=10; i<=100; i+=10){
			System.out.print(i+"\t");
		}
		System.out.println();
		// 5 4 3 2 1
		for (int j = 5; j > 0; j--) {
			System.out.print(j+"\t");
		}
		System.out.println();
		
//		int j=10000;
//		do {
//			System.out.print(j+"\t");
//			j = j/10;
//		}while (j>0);
//		System.out.println();
		// 10000 1000 100 10 1
		for (int k = 10000; k > 0 ; k/=10) {
			System.out.print(k+"\t");
		}
	}
	
}
