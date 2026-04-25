package practice.game;

import java.util.Scanner;

public class Game_Method {
    static Scanner sc = new Scanner(System.in);
    static Novice novice = null;
    static int level = 1;
    public static void MainMenu() {
        
        while (true) {
            // 캐릭터가 생성돼있으면 상태창 표시
            if (novice != null) {
                System.out.println("""
                [닉네임:%s(%s)|STAT:힘(%d)|민첩(%d)|지능(%d)]
                LV:%d
                """.formatted(novice.getName(),novice.getJob(),novice.getStr(),novice.getDex(),novice.getIntel(),level));
            }
            // 메인 메뉴 화면
            System.out.println("""
                    === ABCDE_RPG ===
                    1. 캐릭터 재생성
                    2. 전직하기
                    3. 기본 공격
                    4. 스킬 사용
                    5. 스킬 배우기(미구현)
                    6. 레벨업
                    0. 종료
                    =================
                    """);
            // 숫자를 입력 받아 진행
            System.out.print("번호 입력 : ");
            int selectMenu = sc.nextInt();
            System.out.println();
            // 메뉴 선택
            switch (selectMenu){
                // 캐릭터 재생성
                case 1 -> {
                    
                    System.out.print("닉네임 입력 : ");
                    String name = sc.next();
                    System.out.println();
                    createCharacter(name);
                    
                }
                // 전직
                case 2 -> changeJob();
                // 기본 공격
                case 3 -> novice.attack();
                // 스킬 공격
                case 4 -> novice.skill();
                // 스킬 배우기(미구현)
                case 5 -> learnSkill();
                // 레벨업
                case 6 -> levelUp();
                // 종료
                case 0 -> {
                    System.out.println("게임이 종료됩니다.");
                    System.exit(0);
                }
                // 보기에 없는 숫자 입력시 예외처리
                default -> System.out.println("번호를 잘못 입력했습니다.\n");
            }
        }
    }
    // 캐릭터 생성 메서드
    
    public static Novice createCharacter(String name) {
        int str=0, dex=0, intel=0, sum=0;
        while (true) {
            // 1~10 까지 각 stat 능력치를 랜덤으로 부여
            str=(int) (Math.random()*10)+1;
            dex=(int) (Math.random()*10)+1;
            intel=(int) (Math.random()*10)+1;
            sum=str+dex+intel;
            // 능력치의 합이 반드시 15이상이 되도록 함
            if (sum < 15) {
                continue;
            }
            // 능력치 선택 확인
            System.out.print("""
                    스탯을 부여합니다. (1~10)
                    부여된 스탯정보 : 힘[%s], 민첩[%s], 지능[%s]
                    스탯을 다시 받으시겠습니까? ( y / n )
                    """.formatted(str,dex,intel));
            String yesOrNo = sc.next();
            System.out.println();
            // y 입력시 재실행
            if (yesOrNo.equals("y")) {
                continue;
            }
            // n 입력시 캐릭터 생성
            else if (yesOrNo.equals("n")) {
                System.out.println("현재 정보로 저장합니다.");
                System.out.println();
                novice = new Novice(name,str,dex,intel);
            }
            return novice;
        }
        
    }
    // 메인 화면 복귀 메서드
    public static void mainBack() {
        System.out.println();

    }
    // 전직 선택 화면 출력
    public static void changeJob() {
        System.out.print("""
                ==== 직업 종류 ====
                1. 기사
                2. 도적
                3. 마법사
                4. 돌아가기
                =================
                
                """);
        System.out.print("전직할 직업 번호 입력 : ");
        int x = sc.nextInt();
        System.out.println();
        switch (x) {
            case 1 -> changeKnight();
            case 2 -> changeThief();
            case 3 -> changeMagician();
            case 4 -> mainBack();
            default -> System.out.println("번호를 잘못 입력했습니다.");
        }
    }
    // 기사로 전직 메서드
    public static Novice changeKnight() {
        System.out.println("기사로 전직!\n");
        return novice = new Knight(novice.getName(), novice.getStr(), novice.getDex(), novice.getIntel());
    }
    // 도적으로 전직 메서드
    public static Novice changeThief() {
        System.out.println("도적으로 전직!\n");
        return novice = new Thief(novice.getName(), novice.getStr(), novice.getDex(), novice.getIntel());
    }
    // 마법사로 전직 메서드
    public static Novice changeMagician() {
        System.out.println("마법사로 전직!\n");
        return novice = new Magician(novice.getName(), novice.getStr(), novice.getDex(), novice.getIntel());
    }
    // 레벨업 메서드 각 stat을 1~5 랜덤으로 up, level 변수도 +1
    public static Novice levelUp() {
        level++;
        System.out.println("레벨업!\n");
        int strUp = (int)(Math.random()*5)+1;
        int dexUp = (int)(Math.random()*5)+1;
        int intUp = (int)(Math.random()*5)+1;
        System.out.print("""
                [STAT:힘(%d+%d⬆️), 민첩(%d+%d⬆️), 지능(%d+%d⬆️)]
                """.formatted(novice.getStr(),strUp,novice.getDex(),dexUp,novice.getIntel(),intUp));
        int str = novice.getStr() + strUp;
        int dex = novice.getDex() + dexUp;
        int intel = novice.getIntel() + intUp;
        // 직업 유지시키기
        if (novice.getJob().equals("기사")) {
            novice = new Knight(novice.getName(), str, dex, intel);
        } else if (novice.getJob().equals("마법사")) {
            novice = new Magician(novice.getName(), str, dex, intel);
        } else if (novice.getJob().equals("도적")) {
            novice = new Thief(novice.getName(), str, dex, intel);
        }else novice = new Novice(novice.getName(), str, dex, intel);
        
        return novice;
    }
    // 스킬 배우기(미구현)
    public static void learnSkill() {
        System.out.println("배울 스킬을 선택해주세요.");
        int selectSkill = 0;
        if (novice.getJob().equals("기사")) {
            System.out.println("""
                    1. 찌르기
                    2. 방패 막기
                    3. 방패 치기
                    4. 돌아가기
                    """);
            System.out.print("번호 입력 : ");
            selectSkill = sc.nextInt();
            switch (selectSkill) {
                case 1 -> System.out.println("미구현\n");
                case 2 -> System.out.println("미구현\n");
                case 3 -> System.out.println("미구현\n");
                case 4 -> mainBack();
            }
        } else if (novice.getJob().equals("마법사")) {
            System.out.println("""
                    1. 파이어볼
                    2. 썬더볼트
                    3. 매직쉴드
                    4. 돌아가기
                    """);
            System.out.print("번호 입력 : ");
            selectSkill = sc.nextInt();
            System.out.println();
            switch (selectSkill) {
                case 1 -> System.out.println("미구현\n");
                case 2 -> System.out.println("미구현\n");
                case 3 -> System.out.println("미구현\n");
                case 4 -> mainBack();
            }
        } else if (novice.getJob().equals("도적")) {
            System.out.println("""
                    1. 독 바르기
                    2. 훔치기
                    3. 은신
                    4. 돌아가기
                    """);
            System.out.print("번호 입력 : ");
            selectSkill = sc.nextInt();
            switch (selectSkill) {
                case 1 -> System.out.println("미구현\n");
                case 2 -> System.out.println("미구현\n");
                case 3 -> System.out.println("미구현\n");
                case 4 -> mainBack();
            }
        } else System.out.println("전직을 먼저 해주세요.");
        
    }

}
