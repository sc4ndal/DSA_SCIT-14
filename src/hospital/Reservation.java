package hospital;

import java.util.Objects;

/*
	진료 예약 정보를 정의하는 클래스
 */
public class Reservation {

	// 💡 Code Here 💡
	// 예약 상태 상수 작성 (RESERVED="예약완료", COMPLETED="진료완료", CANCELED="취소")
	public static final String RESERVED = "예약완료";
	public static final String COMPLETED = "진료완료";
	public static final String CANCELED = "취소";
	// 💡 Code Here 💡
	// 요구사항에 맞춰 멤버변수 작성 (예약번호, 환자, 의사, 날짜, 시간, 상태)
	private static int serialNum = 1;
	private int reservationId;
	private Patient patient;
	private Doctor doctor;
	private String date; //"yyyy-MM-dd
	private int time; //9 ~ 17
	private String status;
	
	// 💡 Code Here 💡
	// 요구사항에 맞춰 명시적 생성자 작성
	
	public Reservation(Patient patient, Doctor doctor, String date, int time) {
		this.patient = patient;
		this.doctor = doctor;
		this.date = date;
		this.time = time;
		this.reservationId = serialNum;
		this.serialNum++;
		this.status = RESERVED;
	}
	
	// 💡 Code Here 💡
	// 요구사항에 맞춰 getter / 상태 setter 작성
	//getter
	public static int getSerialNum() {
		return serialNum;
	}
	public int getReservationId() {
		return reservationId;
	}
	public Patient getPatient() {
		return patient;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public String getDate() {
		return date;
	}
	public int getTime() {
		return time;
	}
	public String getStatus() {
		return status;
	}
	//setter
	public void setStatus(String status) {
		this.status = status;
	}
	
	// 💡 Code Here 💡
	// 요구사항에 맞춰 equals & hashCode 오버라이드
	
	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Reservation that = (Reservation) o;
		return reservationId == that.reservationId;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(reservationId);
	}
	
	// 💡 Code Here 💡
	// 요구사항에 맞춰 toString 오버라이드
	
	@Override
	public String toString() {
		return String.format("[예약#%03d] %s %d시 / 환자: %s(%d) / 의사: %s(%s), 상태: %s",
				this.reservationId, this.date, this.time, this.patient.getName(), this.patient.getPatientId(), this.doctor.getName(), this.doctor.getDepartment(), this.status);
	}
}
