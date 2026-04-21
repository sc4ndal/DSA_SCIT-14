package practice.chapter10_Abstraction;

public class Magician extends Novice implements Skill {
	// 명시적생성자
	
	public Magician(String name, int str, int dex, int intel) {
		super(name, str, dex, intel);
	}
	
	@Override
	public void attack() {
		System.out.println("지팡이 공격");
	}
	
	@Override
	public String getJob() {
		return "마법사";
	}
	
	@Override
	public void skill() {
		System.out.println("플레임볼");
	}
}
