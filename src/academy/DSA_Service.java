package academy;

import java.util.*;

public class DSA_Service {
	private ArrayList<Student> studentList;
	private Scanner sc;
	
	public DSA_Service() {
		studentList = new ArrayList<>();
		sc = new Scanner(System.in);
	}
	
	public void mainMenu() {
		System.out.println("""
				\n[ DSA_ACADEMY ]
				1. 학생 등록
				2. 성적 수정
				3. 학생 조회
				4. 전체 조회
				5. 순위 조회
				0. 프로그램 종료
				""");
		System.out.print("선택 > ");
	}
	
	public void insertStudent() {
		System.out.printf("\n[ 학생등록 ]\n");
		
		System.out.print("이름 입력 > ");
		String name = sc.next();
		boolean check = false;
		do {
			System.out.print("*Java : ");
			int java = sc.nextInt();
			
			System.out.print("*DB : ");
			int db = sc.nextInt();
			
			System.out.print("*WEB : ");
			int web = sc.nextInt();
			if (!(0 <= java && java <= 100) || !(0 <= db && db <= 100) || !(0 <= web && web <= 100)) {
				System.out.println("점수는 0~100 점 이내로 입력하세요.");
			} else {
				Student st = new Student(name, java, db, web);
				studentList.add(st);
				System.out.println("등록되었습니다.");
				check = true;
			}
		} while (check == false);
		
	}
	
	public void updateScore() {
		System.out.printf("\n[성적수정]\n");
		if (studentList.isEmpty()) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		System.out.print("학번 입력 > ");
		int stdNum = sc.nextInt();
		boolean check = false;
		for (Student s : studentList) {
			if (stdNum == s.getStdNum()) {
				do {
					System.out.print("*Java : ");
					int java = sc.nextInt();
					System.out.print("*DB : ");
					int db = sc.nextInt();
					System.out.print("*WEB : ");
					int web = sc.nextInt();
					if (!(0 <= java && java <= 100) && !(0 <= db && db <= 100) && !(0 <= web && web <= 100)) {
						System.out.println("점수는 0~100 점 이내로 입력하세요.");
					} else {
						s.edit(java, db, web);
						System.out.print("""
								*Java : %d
								*DB : %d
								*WEB : %d
								""".formatted(java, db, web));
						check = true;
					}
				} while (check == false);
			}
		}
		System.out.println("수정되었습니다.");
	}
	
	public void selectStudent() {
		System.out.print("\n[ 학생조회 ]\n");
		if (studentList.isEmpty()) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		
		System.out.print("이름 입력 > ");
		String name = sc.next();
		
		for (Student s : studentList) {
			if (s.getName().equals(name)) {
				System.out.println(s);
				return;
			}
		}
		System.out.printf("%s 학생의 정보가 없습니다.", name);
		System.out.println();
	}
	
	public void selectAll() {
		System.out.println("\n[ 전체조회 ]");
		if (studentList.isEmpty()) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getName().compareTo(s2.getName()) == 0) {
					return s2.getStdNum() - s1.getStdNum();
				}
				return s1.getName().compareTo(s2.getName());
			}
		});
		for (Student s : studentList) {
			System.out.println(s);
		}
	}
	
	public void selectRank() {
		System.out.println("\n[ 성적 순위 결과 ]");
		if (studentList.isEmpty()) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s2.getSum() - s1.getSum();
			}
		});
		
		int[] ranking = new int[studentList.size()];
		
		for (int i = 0; i < studentList.size(); i++) {
			ranking[i] = 1;
			for (int j = 0; j < studentList.size(); j++) {
				if (studentList.get(i).getSum() < studentList.get(j).getSum()) {
					ranking[i]++;
				}
			}
		}
		for (int i = 0; i < studentList.size(); i++) {
			System.out.printf("[%d등] - %d점_%s", ranking[i], studentList.get(i).getSum(), studentList.get(i).getName());
			System.out.println();
		}
		
	}
}
