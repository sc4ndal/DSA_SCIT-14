package hospital;

public abstract class Person {
	public static final String HOSPITAL = "SeoulMedical";

	private String name;	// 이름
	private String phone;	// 전화번호

	public Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getPhone() { return phone; }
	public void setPhone(String phone) { this.phone = phone; }

	public abstract int getId();

	public abstract String getRole();
}
