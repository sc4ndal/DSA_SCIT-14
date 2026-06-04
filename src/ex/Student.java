package ex;

public class Student extends Person {
	int stdNo;
	
	public Student(String name, int age, int stdNo) {
		super(name, age);
		this.stdNo = stdNo;
	}
	
	@Override
	public void update(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	public void update(String name, int age, int stdNo) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
	}
	
	@Override
	public String toString() {
		return String.format("학번:%d, 이름:%s, 나이:%d", this.stdNo, this.name, this.age);
	}
}
