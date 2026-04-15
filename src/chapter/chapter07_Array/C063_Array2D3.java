package chapter.chapter07_Array;

/*
	[불규칙 배열]
	2차원 배열에서 2번째 배열의 길이가 서로 다른 배열
 */
public class C063_Array2D3 {
	public static void main(String[] args) {
		int[][] score = {
				{55, 44, 77, 46, 62, 87, 37, 86},
				{55, 84},
				{26, 87, 26, 73, 15}
		};
		int count=0;
		int sum=0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
				sum+=score[i][j];
				count++;
			}
			System.out.println();
		}
		System.out.println("=======================");
//		System.out.println(count);
		double avg = (double) sum/count;
		System.out.printf("합 : %d\n", sum);
		System.out.printf("평균 : %.2f\n",avg);
	}
}
