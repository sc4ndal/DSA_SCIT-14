package practice.game;

public class Thief extends Novice implements Skill{
    public Thief(String name, int str, int dex, int intel) {
        super(name, str, dex, intel);
    }

    public void attack() {
        System.out.println("단검 공격\n");
    }
    public String getJob() {
        return "도적";
    }
    @Override
    public void skill() {
        System.out.println("수리검 던지기\n");
    }
}
