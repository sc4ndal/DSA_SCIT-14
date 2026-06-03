package practice.chapter08_Inheritance;

import javax.xml.namespace.QName;

public class Member {
	String id;
	String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getDiscount(int price) {
		return 0;
	}
	
	public int getPoint(int price) {
		return price * (1/100);
	}
	
	public void showInfo() {
		System.out.printf("회원정보 : ID(%s), 이름(%s)").format(id,name);
	}
}

class NormalMember extends Member{
	String grade = "일반";
	
	public NormalMember(String id, String name) {
		super(id, name);
	}
	
	@Override
	public int getDiscount(int price) {
		return getDiscount(price * 5 / 100);
	}
	
	@Override
	public int getPoint(int price) {
		return getPoint(price * 2 / 100);
	}
	
	@Override
	public void showInfo() {
		System.out.println("""
				[회원정보]
				아이디 : %s
				이름 : %s
				등급 : %s
				""".formatted(id, name, grade));
	}
}

class VIPMember extends Member {
	String grade = "VIP";
	public VIPMember(String id, String name) {
		super(id, name);
	}
	
	@Override
	public int getDiscount(int price) {
		return super.getDiscount(price);
	}
	
	@Override
	public int getPoint(int price) {
		return super.getPoint(price);
	}
	
	@Override
	public void showInfo() {
		System.out.println("""
				[회원정보]
				아이디 : %s
				이름 : %s
				등급 : %s
				""".formatted(id, name, grade));
	}
	
}
