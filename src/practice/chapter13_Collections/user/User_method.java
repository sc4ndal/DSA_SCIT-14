package practice.chapter13_Collections.user;

import java.util.*;

public class User_method {
	Scanner sc = new Scanner(System.in);
	List<User> userList = new ArrayList<User>();
	public void abc() {
		userList.add(new User("1", "1", "닉네임", "010-1234-5678", "부산시"));
		userList.add(new User("2", "2", "닉네임", "010-1234-5678", "부산시"));
	}
	
	// 메뉴 출력 메서드
	public void printMenu() {
		System.out.print("""
				== 유저 관리 시스템 ==
				1. 유저 정보 등록
				2. 유저 정보 조회
				3. 전체 정보 조회
				4. 회원 정보 수정
				0. 종		 료
				===================
				""");
		System.out.print("-> 메뉴 번호 입력 : ");
	}
	
	public void createUser() {
		System.out.println("===================");
		System.out.print("-> 아이디 : ");
		String id = sc.next();
		
		System.out.print("-> 비밀번호 : ");
		String pw = sc.next();
		
		System.out.print("-> 이름 : ");
		String name = sc.next();
		
		System.out.print("-> 휴대폰번호 : ");
		String phone = sc.next();
		
		System.out.print("-> 주소 : ");
		String address = sc.next();
		
		// 유저 정보 저장
		User user = new User(id, pw, name, phone, address);
		// 중복 id 확인
		for (User u : userList) {
			if (u.getId().equals(id)) {
				System.out.println("[등록 실패] 존재하는 ID입니다.");
				return; // 메서드 종료
			}
		}
		// 유저 리스트 정보 저장
		userList.add(user);
		System.out.println("등록성공");
		System.out.println(user);
	}
	
	public void selectUser() {
		System.out.println("===================");
		System.out.print("-> id 입력 :");
		String id = sc.next();
		boolean check = false;
		for (User u : userList) {
			if (u.getId().equals(id)) {
				System.out.print("-> pw 입력 :");
				String pw = sc.next();
				if (u.getPw().equals(pw)) {
					System.out.println("[조회 성공]");
					System.out.println(u);
					check = true;
					break;
				} else {
					System.out.println("조회실패");
					return;
				}
			}
		}
		if (check == false) {
			System.out.println("조회실패");
		}
		
	}
	
	public void selectAll() {
		System.out.println("===================");
		
		Collections.sort(userList, new Comparator<User>() {
			@Override
			public int compare(User u1, User u2) {
				return u1.getName().compareTo(u2.getName());
			}
		});
		
		
		if (userList.isEmpty()) {
			System.out.println("데이터가 없습니다.");
		}
		for (User u : userList) {
			System.out.println(u);
		}
		System.out.println("===================");
	}
	
	public void editQ() {
		System.out.println("===================");
		System.out.print("""
				1. 수정
				0. 돌아가기
				""");
		System.out.println("===================");
		System.out.print("-> 번호 입력 : ");
		int num = sc.nextInt();
		System.out.println("===================");
		switch (num) {
			case 1 -> {
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();
				userEdit(id, pw);
			}
			case 0 -> {
				return;
			}
			default -> errorMesseage(1);
		}
		
	}
	
	public void userEdit(String id, String pw) {
		System.out.print("""
				===================
				1. 아이디 수정
				2. 이름 수정
				3. 휴대폰 수정
				4. 주소 수정
				0. 돌아가기
				===================
				""");
		System.out.print("-> 번호 입력 : ");
		int num = sc.nextInt();
		switch (num) {
			case 1 -> {
				for (User u : userList) {
					if (u.getId().equals(id) && u.getPw().equals(pw)) {
						System.out.print("변경할 아이디 입력 : ");
						String editId = sc.next();
						u.setId(editId);
					}
				}
			}
			case 2 -> {
				for (User u : userList) {
					if (u.getId().equals(id) && u.getPw().equals(pw)) {
						System.out.print("변경할 이름 입력 : ");
						String editName = sc.next();
						u.setName(editName);
					}
				}
			}
			case 3 -> {
				for (User u : userList) {
					if (u.getId().equals(id) && u.getPw().equals(pw)) {
						System.out.print("변경할 휴대폰번호 입력 : ");
						String editPhone = sc.next();
						u.setPhone(editPhone);
					}
				}
			}
			case 4 -> {
				for (User u : userList) {
					if (u.getId().equals(id) && u.getPw().equals(pw)) {
						System.out.print("변경할 주소 입력 : ");
						String editAddress = sc.next();
						u.setAddress(editAddress);
					}
				}
			}
			case 0 -> {
				return;
			}
			default -> errorMesseage(1);
		}
	}
	
	public void errorMesseage(int i) {
		switch (i) {
			case 1 -> System.out.println("잘못 입력했습니다.");
		}
	}
}


