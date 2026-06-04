package ex;

public class Teacher extends Person {
	String major;
	
	
	public Teacher(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	@Override
	public void update(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	public void update(String name, int age, String major) {
		this.setName(name);
		this.setAge(age);
		this.major = major;
	}
	
	@Override
	public String toString() {
		return String.format("이름:%s, 나이:%d, 과목:%s", this.name, this.age, this.major);
	}
}
