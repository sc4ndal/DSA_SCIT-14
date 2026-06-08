package hospital;

import javax.print.Doc;
import java.util.*;

/*
	각 기능을 구현한 메서드를 정의한 클래스
 */
public class HospitalService {
	// 진료과 목록 (상수)
	public static final String[] DEPARTMENTS = {
			"내과", "외과", "소아과", "정형외과", "피부과"
	};
	
	// 멤버 변수
	private HashMap<Integer, Patient> patientMap;            // 환자번호 -> Patient
	private HashMap<Integer, Doctor> doctorMap;                // 의사번호 -> Doctor
	private HashMap<Integer, Reservation> reservationMap;    // 예약번호 -> Reservation
	private Scanner scan;                                    // Main에서 주입받은 공용 Scanner
	
	// 생성자 - Scanner를 외부에서 주입받아 공유한다.
	public HospitalService(Scanner scan) {
		patientMap = new HashMap<>();
		doctorMap = new HashMap<>();
		reservationMap = new HashMap<>();
		this.scan = scan;
		
	}
	
	// -------------------------------------------------------------
	// 메인메뉴
	public void mainMenu() {
		System.out.println("""
				
				[ SeoulMedical 진료예약 시스템 ]
				1. 환자 등록
				2. 의사 등록
				3. 진료 예약
				4. 예약 취소
				5. 진료 완료 처리
				6. 전체 예약 조회
				0. 프로그램 종료
				""");
		System.out.print("선택 > ");
	}
	
	// -------------------------------------------------------------
	// 1) 환자 등록
	public void insertPatient() {
		System.out.println("\n[ 환자등록 ]");
		
		// 💡 Code Here 💡
		// 1. 이름, 전화, 출생연도, 혈액형을 입력 받기
		System.out.print("이름 입력	> ");
		String name = scan.next();
		System.out.print("전화 입력	> ");
		String phone = scan.next();
		// 2. 출생연도(1900~2026), 혈액형(A/B/O/AB) 유효성 검증
		
		int birthYear = 0;
		while (true) {
			try {
				System.out.print("*출생연도	: ");
				birthYear = scan.nextInt();
				InvalidInputException.checkBirth(birthYear);
				break;
			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("YYYY 형식으로 입력해주세요(예:2026)");
			}
		}
		String bloodType = null;
		while (true) {
			try {
				System.out.print("*혈액형	: ");
				bloodType = scan.next();
				InvalidInputException.checkBlood(bloodType);
				break;
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("혈액형은 A, B, O, AB 중 하나로 입력하세요.");
			}
		}
		//    - 잘못된 입력은 사용자 정의 예외(InvalidInputException)를 발생시키고 재입력 받기
		// 3. Patient 인스턴스를 생성하여 patientMap에 저장
		Patient patient = new Patient(name, phone, birthYear, bloodType);
		patientMap.put(patient.getPatientId(), patient);
		System.out.println("등록되었습니다.");
	}
	
	// -------------------------------------------------------------
	// 2) 의사 등록
	public void insertDoctor() {
		System.out.println("\n[ 의사등록 ]");
		
		System.out.print("이름 입력 > ");
		String name = scan.next();
		
		System.out.print("전화 입력 > ");
		String phone = scan.next();
		
		System.out.println("""
				진료과 선택:
				  1. 내과
				  2. 외과
				  3. 소아과
				  4. 정형외과
				  5. 피부과
				""");
		
		int num = 0;
		String department = "";
		while (true) {
			try {
				System.out.print("*진료과	: ");
				num = scan.nextInt();
				InvalidInputException.checkNum(num);
				switch (num) {
					case 1 -> department = DEPARTMENTS[0];
					case 2 -> department = DEPARTMENTS[1];
					case 3 -> department = DEPARTMENTS[2];
					case 4 -> department = DEPARTMENTS[3];
					case 5 -> department = DEPARTMENTS[4];
				}
				break;
			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("1~5 번 중 선택");
			}
		}
		
		int carrer = 0;
		while (true) {
			try {
				System.out.print("*경력년수	: ");
				carrer = scan.nextInt();
				InvalidInputException.checkCarrer(carrer);
				break;
			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("0~60 사이 입력");
			}
		}
		Doctor doctor = new Doctor(name, phone, department, carrer);
		doctorMap.put(doctor.getDoctorId(), doctor);
		System.out.println("등록되었습니다.");
		
		// 💡 Code Here 💡
		// 1. 이름, 전화, 진료과(1~5번 선택), 경력년수(0~60)를 입력 받기
		// 2. 잘못된 입력은 사용자 정의 예외를 발생시키고 재입력 받기
		// 3. Doctor 인스턴스를 생성하여 doctorMap에 저장
		
	}
	
	// -------------------------------------------------------------
	// 3) 진료 예약
	public void makeReservation() {
		System.out.println("\n[ 진료예약 ]");
		
		// 💡 Code Here 💡
		// 1. 환자번호 입력 → patientMap에서 조회 (없으면 메시지 출력 후 종료)
		System.out.print("환자번호 입력 > ");
		int patientId = scan.nextInt();
		if (!(patientMap.containsKey(patientId))) {
			System.out.println("환자정보가 없습니다.");
			return;
		}
		
		// 2. 의사번호 입력 → doctorMap에서 조회 (없으면 메시지 출력 후 종료)
		System.out.print("의사번호 입력 > ");
		int doctorId = scan.nextInt();
		if (!(doctorMap.containsKey(doctorId))) {
			System.out.println("의사정보가 없습니다.");
			return;
		}
		
		// 3. 예약 날짜(yyyy-MM-dd 형식), 시간(9~17) 입력 받고 유효성 검증
		String date = "";
		while (true) {
			try {
				System.out.print("*날짜(yyyy-MM-dd): ");
				date = scan.next();
				InvalidInputException.checkDate(date);
				break;
			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("yyyy-MM-dd 형식으로 입력");
			}
		}
		int time = 0;
		while (true) {
			try {
				System.out.print("*시간(9~17)	: ");
				time = scan.nextInt();
				InvalidInputException.checkTime(time);
				break;
			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("9~17 사이 입력");
			}
		}
		
		// 4. 시간 충돌 검증:
		//    - 같은 의사가 같은 날짜+시간에 "예약완료" 상태의 다른 예약을 가질 수 없음
		boolean found = false;
		while (found) {
			try {
				for (Reservation r : reservationMap.values()) {
					for (int i = 1; i < doctorMap.size(); i++) {
						if (doctorId == r.getDoctor().getDoctorId()) {
							if (r.getDate().equals(date)) {
								if (r.getTime() == time) {
//								InvalidInputException.checkRe();
//								System.out.println();
									found = true;
//								throw new InvalidInputException("해당 시간에 의사의 다른 예약이 있습니다.");
								}
							}
						}
					}
				}
			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
			}
		}
		
		//    - 같은 환자가 같은 날짜+시간에 "예약완료" 상태의 다른 예약을 가질 수 없음
		// 5. Reservation 인스턴스 생성하여 reservationMap에 저장
		for (Reservation r : reservationMap.values()) {
			for (int i = 1; i < patientMap.size(); i++) {
				if (r.getPatient().getPatientId() == patientId) {
					if (r.getDate().equals(date)) {
						if (r.getTime() == time) {
							throw new InvalidInputException("해당 시간에 환자의 다른 예약이 있습니다.");
						}
					}
				}
			}
			return;
		}
		
		Reservation re = new Reservation(patientMap.get(patientId), doctorMap.get(doctorId), date, time);
		reservationMap.put(re.getReservationId(), re);

		System.out.println("예약되었습니다.");
		
	}
	
	// -------------------------------------------------------------
	// 4) 예약 취소
	public void cancelReservation() {
		System.out.println("\n[ 예약취소 ]");
		
		// 💡 Code Here 💡
		// 1. 예약번호를 입력 받기
		System.out.print("예약번호 입력 > ");
		int num = scan.nextInt();
		
		// 2. reservationMap에서 해당 예약을 찾고, "예약완료" 상태일 경우에만 "취소" 로 변경
		if (reservationMap.get(num).getStatus().equals(Reservation.RESERVED)) {
			reservationMap.get(num).setStatus(Reservation.CANCELED);
		}
	}
	
	// -------------------------------------------------------------
	// 5) 진료 완료 처리
	public void completeReservation() {
		System.out.println("\n[ 진료완료처리 ]");
		
		// 💡 Code Here 💡
		// 1. 예약번호를 입력 받기
		System.out.print("예약번호 입력 > ");
		int num = scan.nextInt();
		// 2. reservationMap에서 해당 예약을 찾고, "예약완료" 상태일 경우에만 "진료완료" 로 변경
		if (reservationMap.get(num).getStatus().equals(Reservation.RESERVED)) {
			reservationMap.get(num).setStatus(Reservation.COMPLETED);
		}
	}
	
	// -------------------------------------------------------------
	// 6) 전체 예약 조회
	public void selectAllReservations() {
		System.out.println("\n[ 전체예약조회 ]");
		if (reservationMap.isEmpty()) {
			System.out.println("예약정보가 없습니다.");
		}
		ArrayList<Reservation> rese = new ArrayList<>();
		
		rese.sort(new Comparator<Reservation>() {
			@Override
			public int compare(Reservation r1, Reservation r2) {
				if (r2.getReservationId() == r1.getReservationId()) {
					if (r2.getTime() == r1.getTime()) {
						return Integer.parseInt(r2.getDate()) - Integer.parseInt(r1.getDate());
					}
					return r2.getTime() - r1.getTime();
				}
				return r2.getReservationId() - r1.getReservationId();
			}
		});

		System.out.println("정렬됨");
		// 💡 Code Here 💡
		// 1. reservationMap에 등록된 모든 예약을 다음 정렬조건으로 출력
		//    (1순위: 날짜 오름차순, 2순위: 시간 오름차순, 3순위: 예약번호 오름차순)
		List<Reservation> re = new ArrayList<>(reservationMap.values());
		for (Reservation d : re) {
			System.out.println(d);
		}
	}
}

