package week04.sub06;

public class Player {
    public static final int BEGINNER_LEVEL = 1;
    public static final int ADVANCED_LEVEL = 2;
    public static final int SUPER_LEVEL = 3;
    int level;

    public Player() {
        level = BEGINNER_LEVEL;
    }

    public void jump() {}

    public void run() {}

    public void turn() {}

    public void play(int time) {
        run();

        for (int i = 0; i < time; i++) {
            jump();
        }
        turn();
    }

    public void upgradeLevel(int level) {
        this.level = level;
    }
}