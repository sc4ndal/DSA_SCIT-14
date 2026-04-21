package practice.game;

public class Magician extends Novice implements Skill{
    public Magician(String name, int str, int dex, int intel) {
        super(name, str, dex, intel);
        System.out.println("마법사로 전직!\n");
    }
    public void attack() {
        System.out.println("지팡이 공격\n");
    }
    public String getJob() {
        return "마법사";
    }
    @Override
    public void skill() {
        System.out.println("매직볼트\n");
    }
}
