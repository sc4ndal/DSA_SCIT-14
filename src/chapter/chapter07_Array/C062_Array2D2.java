package chapter.chapter07_Array;

public class C062_Array2D2 {
	public static void main(String[] args) {
		// 2차원 배열 성적처리
		int[][] score = {{47, 38, 83, 83, 59},
						{66, 48, 81, 61, 27},
						{55, 37, 75, 77, 100},
						{36, 36, 83, 60, 48},
						{59, 52, 62, 59, 70}};
		
		int classSum = 0;
		System.out.println("=== 반별 성적 ====");
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
			double avg = (double) sum / score[i].length;
			System.out.printf("%d반 => 총점 : %d, 평균 : %.2f\n", i+1,sum,avg);
			classSum+=sum;
		}
		System.out.println("전체 합 : "+classSum);
		double totalAvg = (double) classSum / (score.length*score[0].length);
		System.out.printf("전체 평균 : %.2f", totalAvg);
		
	}
}
