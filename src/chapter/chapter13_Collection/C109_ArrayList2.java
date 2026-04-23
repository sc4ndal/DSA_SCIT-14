package chapter.chapter13_Collection;

import java.util.ArrayList;
import java.util.Arrays;

class Student {
	String name;
	int stdNum;
	
	public Student(String name, int stdNum) {
		this.name = name;
		this.stdNum = stdNum;
	}
	
	public String getName() {
		return name;
	}
	
	public int getStdNum() {
		return stdNum;
	}
	
	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", stdNum=" + stdNum + '}';
	}
}


public class C109_ArrayList2 {
	public static void main(String[] args) {
		ArrayList<Student> stList = new ArrayList<>();
		stList.add(new Student("홍길동",20260001));
		stList.add(new Student("강감찬",20260002));
		stList.add(new Student("이순신",20260003));
		
		for (int i = 0; i < stList.size(); i++) {
			String result = String.format("이름 : %s, 학번 : %d", stList.get(i).getName(), stList.get(i).getStdNum());
			System.out.println(result);
		}
		
		System.out.println("=== foreach문 ===");
		for (Student s : stList) {
			System.out.println(s);		// toString() 자동 호출
		}
	}
}
