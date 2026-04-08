package practice.chapter04_Loop;

public class Loop_Example04 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print(0+"\t");
			}
			System.out.println(0+"\t");
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
	}
}
