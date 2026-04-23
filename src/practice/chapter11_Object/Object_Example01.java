package practice.chapter11_Object;

import java.util.Arrays;
import java.util.Scanner;

public class Object_Example01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sex="", ge="";
		
		System.out.print("주민등록번호를 입력하세요 (예: 980101-1234567) : ");
		String pNum = sc.next();
		String year = pNum.substring(0,2);
		String month = pNum.substring(2,4);
		String day = pNum.substring(4,6);
		
		if (pNum.length() == 14 && (pNum.indexOf("-") == 6)) {
			System.out.println(pNum);
			switch (pNum.charAt(7)) {
				case '1', '2' -> ge = "19";
				case '3', '4' -> ge = "20";
			}
			switch (pNum.charAt(7)) {
				case '1', '3' -> sex = "남성";
				case '2', '4' -> sex = "여성";
			}
			year = ge+year;
		} else {
			System.exit(0);
		}
		System.out.println("""
				출생 연도 : %s
				출생 월 : %s
				출생 일 : %s
				성별 : %s
				""".formatted(year,month,day,sex));
//		System.out.println("출생 연도 : " + year);
//		System.out.println("출생 월 : " + month);
//		System.out.println("출생 일 : " + day);
//		System.out.println("성별 : " + sex);
		
	}
}
