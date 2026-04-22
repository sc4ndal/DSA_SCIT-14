package practice.game;

import java.util.Scanner;

public class Main_Intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("""
                |=================|
                |                 |
                |    WELCOME TO   |
                |    ABCDE_RPG👾  |
                |                 |
                |=================|
                
                닉네임을 입력해주세요:""");
        String name = sc.nextLine();        // 닉네임 받기
        Game_Method.createCharacter(name);  // 시작하자마자 캐릭터 생성
        Game_Method.MainMenu();             // 캐릭터 생성 후 메인 화면 진행
    }
}
