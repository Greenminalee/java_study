package week04.sub06;

public class MainBoard {
    public static void main(String[] args) {
        Player player1 = new PlayerBeginer();
        player1.play(1);
        player1.upgradeLevel(Player.ADVANCED_LEVEL);

        Player player2 = new PlayerAdvanced();
        player2.play(2);
        player2.upgradeLevel(Player.SUPER_LEVEL);

        Player player3 = new PlayerSuper();
        player3.play(3);
    }
}