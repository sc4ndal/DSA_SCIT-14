package practice.chapter10_Abstraction;

public class Thief extends Novice implements Skill{
	// 명시적생성자
	
	public Thief(String name, int str, int dex, int intel) {
		super(name, str, dex, intel);
	}
	
	@Override
	public void attack() {
		System.out.println("단검 공격");
	}
	
	@Override
	public String getJob() {
		return "도적";
	}
	
	@Override
	public void skill() {
		System.out.println("표창 날리기");
	}
}
