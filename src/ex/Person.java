package ex;

public abstract class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public abstract void update(String name, int age);
	
	public void setAge(int age) {
		if (age < 0 || age > 100) {
			System.out.println("나이 정보가 잘못됐습니다.");
			return;
		} else {
			this.age=age;
		}
	}
}
