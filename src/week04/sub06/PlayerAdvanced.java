package week04.sub06;

public class PlayerAdvanced extends Player{
    @Override
    public void jump() {
        System.out.println("높이 JUMP 합니다");
    }

    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    @Override
    public void play(int time) {
        super.play(time);
    }

    @Override
    public void upgradeLevel(int level) {
        super.upgradeLevel(level);
    }
}
