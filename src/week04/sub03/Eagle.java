package week04.sub03;

public class Eagle extends Animal{
    Eagle()
    {
        this.name = "독수리";
    }

    @Override
    void move() {
        System.out.println(name + "가 하늘을 날아갑니다.");
    }
}
