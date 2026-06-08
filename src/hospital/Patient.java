package hospital;


import java.util.Objects;
// 환자 클래스
public class Patient extends Person {
	
	
	static private int serialNum = 20260001;
	private int patientId;
	private int birthYear;
	private String bloodType;
	
	// 💡 Code Here 💡
	// 요구사항에 맞춰 명시적 생성자 작성
	public Patient(String name, String phone, int birthYear, String bloodType) {
		super(name, phone);
		this.patientId = serialNum;
		this.serialNum++;
		this.birthYear = birthYear;
		this.bloodType = bloodType;
	}
	// 💡 Code Here 💡
	// 요구사항에 맞춰 getter 작성
	
	public int getPatientId() {
		return patientId;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public String getBloodType() {
		return bloodType;
	}
	
	// 💡 Code Here 💡
	// 추상 메서드 오버라이드 (getId, getRole)
	@Override
	
	public int getId() {
		return this.patientId;
	}
	
	@Override
	public String getRole() {
		return "환자";
	}
	// 💡 Code Here 💡
	// 요구사항에 맞춰 equals & hashCode 오버라이드
	
	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Patient patient = (Patient) o;
		return patientId == patient.patientId;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(patientId);
	}
	
	// 💡 Code Here 💡
	// 요구사항에 맞춰 toString 오버라이드
	
	@Override
	public String toString() {
		return String.format("[%s] [%s] 번호: %d / 이름: %s / 전화: %s / 출생: %d / 혈액형: %s",
		HOSPITAL, this.getRole(), this.patientId, this.getName(), this.getPhone(), this.getBirthYear(), this.getBloodType());
	}
}
