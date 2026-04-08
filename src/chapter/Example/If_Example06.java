package chapter.Example;

import java.util.Scanner;

public class If_Example06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(cm): ");
		double cm = sc.nextDouble();
		System.out.print("몸무게(kg): ");
		double kg = sc.nextDouble();
		double cmcm = cm*0.01;
		
		double bmi = kg/(cmcm*cmcm);
		
		if (bmi >= 25) {
			System.out.printf("BMI 지수: " + bmi + "(비만)");
		} else if (bmi >= 23) {
			System.out.printf("BMI 지수: %d" + bmi + "(과체중)");
		} else if (bmi >= 18.5) {
			System.out.printf("BMI 지수: %d" + bmi + "(정상)");
		} else {
			System.out.println("BMI 지수: "+bmi+"(저체중)");
		}
	}
}
