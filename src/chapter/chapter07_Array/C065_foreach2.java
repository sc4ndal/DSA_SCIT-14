package chapter.chapter07_Array;

public class C065_foreach2 {
	public static void main(String[] args) {
		int[][] arr = {
				{27, 37, 49, 59},
				{48, 84, 73, 100},
				{58, 94, 43, 10}
		};
		
		for (int[] i : arr) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
