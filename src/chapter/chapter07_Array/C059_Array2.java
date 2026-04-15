package chapter.chapter07_Array;

public class C059_Array2 {
	public static void main(String[] args) {
		// 학생 성적 관리
		// 1. 배열 선언 후 값 저장
		int[] score = new int[5]; // 5개짜리 배열 생성
		
		score[0]=48;
		score[1]=99;
		score[2]=70;
		score[3]=69;
		score[4]=100;
		
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"번 학생의 성적 : "+score[i]+" ");
		}
		
		// 2. 총점 계산
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}
		System.out.println("총점 : " + sum);
		
		// 3. 평균 계산
		double avg = sum / (double) score.length;
		System.out.printf("평균 : %.1f\n",avg);
		
		// 4. 배열 초기화 방식
		int[] score2 = {36,59,78,99,55,66,77};
		System.out.println("===배열초기화===");
		for (int i = 0; i < score2.length; i++) {
			System.out.println((i+1)+"번 학생의 성적 : "+score2[i]);
		}
	}
}
