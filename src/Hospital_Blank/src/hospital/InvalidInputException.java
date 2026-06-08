package hospital;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;

/*
	잘못된 입력에 대해 발생시키는 사용자 정의 예외
 */
public class InvalidInputException extends RuntimeException {
	
	// 💡 Code Here 💡
	// 메시지를 받는 생성자 작성
	
	public InvalidInputException(String message) {
		super(message);
	}
	
	public static void checkBirth(int birth) throws InvalidInputException {
		if (!(1900 <= birth && birth <= 2026)) {
			throw new InvalidInputException("출생연도는 1900~2026 사이로 입력하세요.");
		}
	}
	
	public static void checkBlood(String blood) {
		if (!(blood.equals("A") || blood.equals("B") || blood.equals("O") || blood.equals("AB"))) {
			throw new InvalidInputException("혈액형은 A, B, O, AB 중 하나로 입력하세요.");
		}
		
	}
	
	public static void checkNum(int num) {
		if (num < 0 || num > 5) {
			throw new InvalidInputException("1~5 번 중 선택");
		}
	}
	
	public static void checkCarrer(int num) {
		if (num < 0 || num > 60) {
			throw new InvalidInputException("0~60 사이 입력");
		}
	}
	
	public static void checkDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);
		boolean isFormatValid = false;
		
		try {
			sdf.parse(date);
			isFormatValid = true;
		} catch (ParseException e) {
			isFormatValid = false;
		}
		
		if (!(isFormatValid)) {
			throw new InvalidInputException("yyyy-MM-dd 형식으로 입력");
		}
		
	}
	
	public static void checkTime(int time) {
		if (time<9||17<time) {
			throw new InvalidInputException("9~17 사이 입력");
		}
	}
	
	public static void checkRe() {
		throw new InvalidInputException("해당 시간에 의사의 다른 예약이 있습니다.");
	}
}




