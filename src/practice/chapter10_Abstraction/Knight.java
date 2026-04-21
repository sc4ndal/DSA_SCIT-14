package practice.chapter10_Abstraction;

public class Knight extends Novice implements Skill {
	
	// 명시적생성자
	
	public Knight(String name, int str, int dex, int intel, double luck) {
		super(name, str, dex, intel, luck);
	}
	
	@Override
	public void attack() {
		System.out.println("배쉬 공격");
	}
	
	@Override
	public String getJob() {
		return "기사";
	}
	
	@Override
	public void skill() {
		System.out.println("스턴 어택");
	}
	

}
