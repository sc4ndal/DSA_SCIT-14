package hospital;

import java.util.Scanner;

/*
	실행 흐름만 정의
 */

public class HospitalMain {
	
	public static void main(String[] args) {

		// Scanner 인스턴스는 프로그램 전체에서 하나만 생성하여 공유한다.
		Scanner scan = new Scanner(System.in);
		HospitalService service = new HospitalService(scan);
		
		while (true) {
			service.mainMenu();		// 메뉴 출력

			int num;
			try {
//				num = Integer.parseInt(scan.nextLine());
				num = scan.nextInt();
			} catch (NumberFormatException e) {
				System.out.println("** 숫자로 입력하세요. **");
				continue;
			}

			switch (num) {
				case 1 -> service.insertPatient();			// 환자 등록
				case 2 -> service.insertDoctor();			// 의사 등록
				case 3 -> service.makeReservation();		// 진료 예약
				case 4 -> service.cancelReservation();		// 예약 취소
				case 5 -> service.completeReservation();	// 진료 완료 처리
				case 6 -> service.selectAllReservations();	// 전체 예약 조회
				case 0 -> {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				default -> System.out.println("** 다시 선택하세요. **");
			}
		}
	}
}
