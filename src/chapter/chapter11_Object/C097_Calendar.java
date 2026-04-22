package chapter.chapter11_Object;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class C097_Calendar {
	
	public static void main(String[] args) {
		
		/*
		 * [날짜 / 시간 관련 클래스]
		 *
		 * 1. Calendar (옛날 방식)
		 * 2. LocalDateTime (최신 방식, Java8 이후)
		 *
		 * ※ 실무에서는 보통 LocalDateTime을 많이 사용한다.
		 */
		
		// =================================================
		// 1. Calendar (옛날 방식)
		// =================================================
		System.out.println("=== Calendar ===");
		
		GregorianCalendar today = new GregorianCalendar();
		
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초\n",
				today.get(Calendar.YEAR),
				today.get(Calendar.MONTH) + 1, // month는 0부터 시작
				today.get(Calendar.DAY_OF_MONTH),
				today.get(Calendar.HOUR_OF_DAY),
				today.get(Calendar.MINUTE),
				today.get(Calendar.SECOND)
		);
		
		// =================================================
		// 2. LocalDateTime (최신 방식)
		// =================================================
		System.out.println("\n=== LocalDateTime ===");
		
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(now);
		
/*
		DateTimeFormatter / SimpleDateFormat 에서 사용하는 "날짜 포맷 패턴"
		날짜와 시간을 문자열로 출력할 때
		특정 문자들이 각각 의미를 가지고 있다.
	
		예)
		yyyy-MM-dd HH:mm:ss
	
		출력 예시
		2026-03-16 14:30:25
	
		각 문자의 의미
		yyyy → 연도
		MM   → 월
		dd   → 일
		HH   → 시
		mm   → 분
		ss   → 초
	
	
		[날짜 관련 포맷 문자]
		패턴        의미                    예시
		y           연도                    25
		yy          연도 (2자리)            25
		yyyy        연도 (4자리)            2025
	
		M           월 (한자리 가능)        4
		MM          월 (2자리)              04
		MMM         월 (영문 축약)          Apr
		MMMM        월 (영문 전체)          April
	
		d           일                      5
		dd          일 (2자리)              05
	
		E           요일                    Mon
		EEEE        요일 전체               Monday
	
	
		[시간 관련 포맷 문자]
		패턴        의미                    예시
		a           오전 / 오후             AM / PM
	
		h           시 (12시간제)           1
		hh          시 (12시간제 2자리)     01
	
		H           시 (24시간제)           1
		HH          시 (24시간제 2자리)     13
	
		m           분                      3
		mm          분 (2자리)              03
	
		s           초                      7
		ss          초 (2자리)              07
	
		S           밀리초                  123
*/
		
		// =================================================
		// 3. 날짜 포맷 변경
		// =================================================
		System.out.println("\n=== DateTimeFormatter ===");
		
		DateTimeFormatter formatter =
				DateTimeFormatter.ofPattern("yyyy년 M월 d일 HH:mm:ss");
		
		String formatted = now.format(formatter);
		
		System.out.println(formatted);
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		System.out.println(now.format(f1));
		System.out.println(now.format(f2));
		System.out.println(now.format(f3));
	}
}