package practice.chapter10_Abstraction;

import java.util.Random;
import java.util.Scanner;

public class GameMain_Method {
	
	private static Scanner sc = new Scanner(System.in);
	private static Random ran = new Random();
	
	//메인 메뉴를 출력해주는 메서드
	public void printMenu() {

		while (true){
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
			int x = sc.nextInt();
			switch (x) {
				case 1 -> createCharacter();
//				case 2 ->{
//					if (character != null) {
//						characterInfo(character);
//					} else {printText(3);}}
//			case 3 -> gm.jobSelect(character);
//				case 4 -> character.attack();
//			case 5 -> character.skill();
				case 0 -> {
					printText(1);
					System.exit(0);
				}
				default -> printText(2);
			}
		}
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
		System.out.println("캐릭터 생성 실행");
		int sum = 0;
		System.out.print("사용하실 아이디를 입력해 주세요 : ");
		String id = sc.next();
		int str,dex,intel;
		
		Novice novice = null;
		
		do {
			str = (int) ((Math.random() * 10)+5);
			dex = (int) ((Math.random() * 10)+5);
			intel = (int) ((Math.random() * 10)+5);
			sum=str=dex=intel;
			System.out.println("스탯을 부여합니다.");
			System.out.printf("부여된 스탯정보 : 힘[%s], 민첩[%s], 지능[%s]\n", str, dex, intel);
			System.out.println("스탯을 다시 받으시겠습니까? (y/n)");
			String choice = sc.nextLine();
			if (choice == "y") {
				sum=0;
			} else if (choice=="n") {
				break;
			}
		}
			while (sum >= 15);

		
		return novice;
	}
	
	//직업에 따라 인스턴스를 생성하는 메서드
	//선택한 직업에 따라 해당 클래스로 인스턴스를 생성하고, 문구를 출력한다.
	public Novice jobSelect(int num, Novice novice) {
		int jobnum = numberInput();
		switch (jobnum) {
//			case 1 -> novice = Knight;
		}
		Novice character = null;
		
		return character;
	}
	
	//전직을 위해 번호를 입력받는 메서드
	public int numberInput() {
		int num = sc.nextInt();
		while(num > 3 || num < 1) {
			System.out.println("""
					=== 직업 종류 ===
					1. 기사
					2. 도적
					3. 마법사
					전직할 직업의 번호를 선택하세요 :
					""");
			num = sc.nextInt();
		}
		return num;
	}
	
	//생성된 캐릭터의 정보를 보여 주는 메서드
	//생성된 인스턴스에 따라 직업표시가 달라진다.
	public void characterInfo(Novice novice) {
		novice.getJob();
	}
	
}