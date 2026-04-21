package practice.game;

import java.util.Scanner;

public class Game_Method {
    private static Scanner sc = new Scanner(System.in);
    static Novice novice = null;
    public static void MainMenu() {
        while (true) {
            System.out.println("""
                    === ABCDE_RPG ===
                    1. 캐릭터 생성
                    2. 캐릭터 정보
                    3. 전직하기
                    4. 기본 공격
                    5. 스킬 사용
                    0. 종료
                    =================
                    """);
            System.out.print("번호 입력 : ");
            int selectMenu = sc.nextInt();

            switch (selectMenu){
                case 1 -> {
                    System.out.print("닉네임 입력 : ");
                    String name = sc.next();
                    System.out.println();
                    createCharacter(name);
                }
                case 2 -> charcterInfo();
                case 3 -> changeJob();
                case 4 -> novice.attack();
                case 5 -> novice.skill();
                case 0 -> {
                    System.out.println("게임이 종료됩니다.");
                    System.exit(0);
                }
                default -> System.out.println("번호를 잘못 입력했습니다.\n");

            }

        }
    }

    public static Novice createCharacter(String name) {
        int str=0, dex=0, intel=0, sum=0;
        do {
            str=(int) (Math.random()*10)+1;
            dex=(int) (Math.random()*10)+1;
            intel=(int) (Math.random()*10)+1;
            sum=str+dex+intel;
            System.out.print("""
                    스탯을 부여합니다.
                    부여된 스탯정보 : 힘[%s], 민첩[%s], 지능[%s]
                    스탯을 다시 받으시겠습니까? ( y / n )
                    """.formatted(str,dex,intel));
            String yesOrNo = sc.next();
            System.out.println();
            if (yesOrNo.equals("y")) {
                sum=0;
            } else if (yesOrNo.equals("n")) {
                System.out.println("현재 정보로 저장합니다.");
                System.out.println();
                novice = new Novice(name,str,dex,intel);
            }
        }while (sum<15);
        return novice;
    }
    public static void charcterInfo() {
        System.out.println("""
                [닉네임 : %s(%s), STAT : 힘(%d), 민첩(%d), 지능(%d)]
                """.formatted(novice.getName(),novice.getJob(),novice.getStr(),novice.getDex(),novice.getIntel()));

    }
    public static void changeJob() {
        System.out.print("""
                ==== 직업 종류 ====
                1. 기사
                2. 마법사
                3. 도적
                =================
                
                """);
        System.out.print("전직할 직업 번호 입력 : ");
        int x = sc.nextInt();
        System.out.println();
        switch (x) {
            case 1 -> changeKnight();
            case 2 -> changeMagician();
            case 3 -> changeThief();
            default -> System.out.println("번호를 잘못 입력했습니다.");
        }
    }
    public static Novice changeKnight() {
        return novice = new Knight(novice.getName(), novice.getStr(), novice.getDex(), novice.getIntel());
    }
    public static Novice changeMagician() {
        return novice = new Magician(novice.getName(), novice.getStr(), novice.getDex(), novice.getIntel());
    }
    public static Novice changeThief() {
        return novice = new Thief(novice.getName(), novice.getStr(), novice.getDex(), novice.getIntel());
    }



}
