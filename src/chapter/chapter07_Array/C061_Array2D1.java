package chapter.chapter07_Array;

/*
	[2차원 배열]
	배열 안에 배열이 있는 구조
	int[][] score
 */
public class C061_Array2D1 {
	public static void main(String[] args) {
		
		int[][] score = {{47, 38, 83, 83, 59},
						{66, 48, 81, 61, 27},
						{55, 37, 75, 77, 100},
						{36, 36, 83, 60, 48},
						{59, 52, 62, 59, 70}};
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1)+"번 학생 성적 : ");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
