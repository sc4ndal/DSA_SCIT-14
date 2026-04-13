package chapter.chapter05_Method;

import java.time.LocalDate;

public class C041_Method4 {
	public static void main(String[] args) {
		int today = getDate();
		System.out.println("오늘 날짜 : " + today + "일");
		
		if (isWeekend()) {
			System.out.println("주말입니다.");
		} else {
			System.out.println("평일입니다.");
		}
	}
	// 오늘 날짜 반환
	static int getDate() {
		return LocalDate.now().getDayOfMonth();
	}
	
	// 주말 여부 판단
	static boolean isWeekend() {
		int day = LocalDate.now().getDayOfWeek().getValue();
		return day == 6 || day == 7;
	}
}
