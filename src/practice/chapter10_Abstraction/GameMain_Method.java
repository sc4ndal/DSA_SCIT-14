package practice.chapter10_Abstraction;

import java.util.Random;
import java.util.Scanner;

public class GameMain_Method {
	
	private static Scanner sc = new Scanner(System.in);
	private static Random ran = new Random();
	
	//메인 메뉴를 출력해주는 메서드
	public void printMenu() {
		System.out.println("""
				=== ABCDE_rpg ===
				1. 캐릭터 생성
				2. 캐릭터 정보
				3. 전직하기
				4. 기본 공격
				5. 스킬 사용
				0. 종료
				=================
				""");
		System.out.print("번호를 선택하세요 : ");
	}
	
	//출력 문구만 모아 놓은 메서드
	public void printText(int num) {
		switch (num) {
			case 1 -> System.out.println("게임을 종료합니다.");
			case 2 -> System.out.println("번호를 잘못 입력하셨습니다.");
			case 3 -> System.out.println("캐릭터를 생성하세요.");
			case 4 -> System.out.println("스킬을 배우지 않았습니다.");
		}
	}
	
	//캐릭터를 생성하는 메서드
	//스탯 힘, 민첩, 지능을 랜덤한 숫자로 스탯의 총 합이 15이상일 경우에만 부여한다.
	//사용자의 선택에 따라 저장 or 스탯 재부여 한다.
	public Novice createCharacter() {
		Novice novice = null;
		System.out.println("캐릭터를 생성합니다.");
		System.out.print("사용하실 아이디를 입력해 주세요 : ");
		String id = sc.next();
		int str = 0, dex = 0, intel = 0, sum = 0;
		
		return novice;
	}
	
	//직업에 따라 인스턴스를 생성하는 메서드
	//선택한 직업에 따라 해당 클래스로 인스턴스를 생성하고, 문구를 출력한다.
	public Novice jobSelect(int num, Novice novice) {
		Novice character = null;
		
		return character;
	}
	
	//전직을 위해 번호를 입력받는 메서드
	public int numberInput() {
		int num = 0;
		while(num > 3 || num < 1) {
			System.out.println("=== 직업 종류 ===");
			System.out.println("1. 기사");
			System.out.println("2. 도적");
			System.out.println("3. 마법사");
			System.out.print("전직할 직업의 번호를 선택하세요 : ");
			num = sc.nextInt();
		}
		return num;
	}
	
	//생성된 캐릭터의 정보를 보여 주는 메서드
	//생성된 인스턴스에 따라 직업표시가 달라진다.
	public void characterInfo(Novice novice) {
	
	}
	
}