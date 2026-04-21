package practice.chapter10_Abstraction;

import java.util.Scanner;

public class GameMain extends GameMain_Method{
	public static void main(String[] args) {
		
		/*
		 * [게임 프로그램 만들기]
		 *
		 * 1. 프로그램이 실행되면 다음 메뉴를 반복하여 출력한다.
		 *    (1. 캐릭터 생성, 2. 캐릭터 정보, 3. 전직하기, 4. 공격하기, 5. 스킬 사용, 0. 종료)
		 * 2. [캐릭터 생성]
		 *    - 이름과 초기 스탯값을 가지는 Novice(평민) 객체를 생성한다.
		 *    - 스탯은 힘, 민첩, 지능 3가지이며 각각 랜덤한 값을 가진다.
		 *    - 단, 스탯의 총합이 15 이상인 경우에만 사용할 수 있다.
		 *    - 생성된 스탯을 사용자에게 보여준 뒤,
		 *      현재 스탯으로 저장할지 또는 다시 스탯을 부여할지 선택할 수 있게 한다.
		 * 3. [캐릭터 정보]
		 *    - 생성된 캐릭터의 이름, 직업, 힘, 민첩, 지능을 출력한다.
		 * 4. [전직하기]
		 *    - 현재 캐릭터의 정보를 유지한 채,
		 *      선택한 직업 클래스의 새로운 객체를 생성한다.
		 *    - 전직 가능한 직업은 자유롭게 정하거나,
		 *      예를 들어 Knight, Thief, Magician 등으로 구성할 수 있다.
		 * 5. [공격하기]
		 *    - attack() 메서드를 호출한다.
		 *    - 직업(객체)에 따라 서로 다른 공격 내용이 출력되도록 한다.
		 * 6. [스킬 사용]
		 *    - skill() 메서드를 호출한다.
		 *    - 직업(객체)에 따라 서로 다른 스킬 내용이 출력되도록 한다.
		 *    - 단, 스킬이 없는 직업은 알맞은 안내 문구를 출력한다.
		 * 7. [종료]
		 *    - 0을 선택하면 프로그램을 종료한다.
		 *
		 * 8. 위 기능은 사용자가 종료를 선택할 때까지 반복 실행되도록 한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		GameMain_Method gm = new GameMain_Method();
		gm.printMenu();
		String name = sc.nextLine();
		Novice character = null;
		int num = 0;
		
	}
}
