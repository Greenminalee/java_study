package week03.sub03;

public class CardCompany {
    private static CardCompany instance = new CardCompany();

    public static CardCompany getInstance() {
        return instance;
    }
    public Card createCard()
    {
        return (new Card());
    }



}
