package practice.chapter10_Abstraction;

// 평민
public class Novice {
	
	// 멤버 변수
	private String name; // 캐릭터 이름
	private int str; // 힘 스탯
	private int dex; // 민첩 스탯
	private int intel; // 지능 스탯
	
	// 명시적생성자
	public Novice(String name, int str, int dex, int intel) {
		this.name = name;
		this.str = str;
		this.dex = dex;
		this.intel = intel;

		System.out.println("""
				캐릭터 생성 완료!
				이름 : %s
				str : %d
				dex : %d
				int : %d
				""".formatted(name,str,dex,intel));
	}
	
	// 멤버 메서드
	public void attack() {System.out.println("기본 공격!");}
	
	public String getJob() {return "평민";}
	
	// getter & setter
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	// stat
	public int getStr() {return str;}
	public int getDex() {return dex;}
	public int getIntel() {return intel;}
}
