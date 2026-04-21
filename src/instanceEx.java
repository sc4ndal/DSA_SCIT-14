class User {
	static int totalUser;
	String id;
	String pw;
	
	{
		totalUser++;
	}
	
	User(String id, String pw) {
		this.id=id;
		this.pw=pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
		System.out.println("비밀번호 변경완료!");
	}
	
	public void userInfo() {
		System.out.println("아이디 : "+id);
		System.out.println("비밀번호 : "+pw);
	}
}

public class instanceEx {
	public static void main(String[] args) {

		User user1 = new User("scit1", "1111");
		User user2 = new User("scit2", "2222");
		User user3 = new User("scit3", "3333");
		
		user1.userInfo();
		System.out.println();
		user2.userInfo();
		System.out.println();
		user3.userInfo();
		System.out.println();
		
		user3.setPw("7777");
		user3.userInfo();
		
		
		System.out.println("총 유저 수 : "+User.totalUser);
	}
}
