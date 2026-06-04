package ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonMain {
	public static void main(String[] args) {
		
		Person st = new Student("이말똥", 30, 10);
		Person te = new Teacher("이선생", 50, "자바");
		
		System.out.println(st);
		System.out.println(te);
		
		st.update("김개똥", 20);
		te.update("김선생", 77);
		System.out.println("============================");
		System.out.println(st);
		System.out.println(te);
		
		Student[] sts = new Student[3];
		Teacher[] tes = new Teacher[3];
		Person[] persons = new Person[3];
		persons[0] = st;
		persons[1] = te;
		System.out.println("=============================");
		System.out.println(persons[0]);
		System.out.println(persons[1]);
		
		System.out.println("=============================");
		// 컬랙션 프레임워크
		// 1. List : 순서가 있고 중복 허용
		System.out.println("---List---");
		List<Person> list = new ArrayList();
		list.add(st);
		list.add(te);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println("=============================");
		
		System.out.println("출력!");
		for (Person p : list) {
			System.out.println(p);
		}
		
		System.out.println("끝!");
		list.remove(0);
		System.out.println(list.get(0));
		list.remove(0);
		System.out.println(list.isEmpty());
		System.out.println("=============================");
		// 2. Map : 키-값 형식, 키는 중복 안됨, 값 중복 가능
		System.out.println("---Map---");
		Map<Integer, Person> map = new HashMap<>();
		map.put(1, st);
		map.put(2, te);
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		// 3. Set : 순서가 보장되지 않고, 중복 안됨
		

	}
}
