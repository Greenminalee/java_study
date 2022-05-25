package week05.sub03;

public class Player {
    private PlayerLevel level;

    Player()
    {
        level = new BeginnerLevel();
    }
    public PlayerLevel getLevel() {
        return level;
    }
    public void upgradeLevel(PlayerLevel l){
        this.level = l;
    }

    public void play(int count){
        level.go(count);
    }
}
