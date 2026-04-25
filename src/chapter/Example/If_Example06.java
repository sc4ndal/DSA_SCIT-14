package chapter.Example;

import java.util.Scanner;

public class If_Example06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(cm): ");
		double cm = sc.nextDouble();
		System.out.print("몸무게(kg): ");
		double kg = sc.nextDouble();
		double m = cm*0.01;
		
		double bmi = kg/(m*m);
		
		if (bmi >= 25) {
			System.out.printf("BMI 지수: %.2f (비만)", bmi);
		} else if (bmi >= 23) {
			System.out.printf("BMI 지수: %.2f (과체중)", bmi);
		} else if (bmi >= 18.5) {
			System.out.printf("BMI 지수: %.2f (정상)", bmi);
		} else {
			System.out.printf("BMI 지수: %.2f (저체중)", bmi);
		}
	}
}
