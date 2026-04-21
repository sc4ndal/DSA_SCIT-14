package practice.game;

public class Knight extends Novice implements Skill{
    public Knight(String name, int str, int dex, int intel) {
        super(name, str, dex, intel);
    }

    public void attack() {
        System.out.println("강공격\n");
    }
    public String getJob() {
        return "기사";
    }
    @Override
    public void skill() {
        System.out.println("방패치기\n");
    }
}
