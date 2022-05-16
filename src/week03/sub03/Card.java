package week03.sub03;

public class Card {
    static int cardNumber = 1000;
    public static int getCardNumber()
    {
        return (++cardNumber);
    }
}
