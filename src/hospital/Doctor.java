package hospital;

import java.util.Objects;

public class Doctor extends Person {

	
	// 💡 Code Here 💡
	// 요구사항에 맞춰 멤버변수 작성 (의사번호, 진료과, 경력년수)
	static private int serialNum = 10001;
	private int doctorId;
	private String department;
	private int careerYears;

	// 💡 Code Here 💡
	// 요구사항에 맞춰 명시적 생성자 작성
	
	public Doctor(String name, String phone, String department, int careerYears) {
		super(name, phone);
		this.doctorId = serialNum;
		this.serialNum++;
		this.department = department;
		this.careerYears = careerYears;
	}
	
	// 💡 Code Here 💡
	// 요구사항에 맞춰 getter 작성
	
	public int getDoctorId() {
		return doctorId;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public int getCareerYears() {
		return careerYears;
	}
	
	// 💡 Code Here 💡
	// 추상 메서드 오버라이드 (getId, getRole)
	@Override
	public int getId() {
		return this.doctorId;
	}
	
	@Override
	public String getRole() {
		return "의사";
	}
	// 💡 Code Here 💡
	// 요구사항에 맞춰 equals & hashCode 오버라이드
	
	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Doctor doctor = (Doctor) o;
		return doctorId == doctor.doctorId;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(doctorId);
	}
	
	// 💡 Code Here 💡
	// 요구사항에 맞춰 toString 오버라이드
	
	@Override
	public String toString() {
		return String.format("[%s] [%s] 번호: %d / 이름: %s / 진료과: %s / 경력: %2d년 / 전화: %s",
		HOSPITAL, this.getRole(), this.doctorId, this.getName(), this.department, this.careerYears, this.getPhone());
	}
}
