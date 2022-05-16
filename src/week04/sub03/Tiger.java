package week04.sub03;

public class Tiger extends Animal{
    Tiger()
    {
        this.name = "호랑이";
    }

    @Override
    void move() {
        System.out.println(name + "네발로 뚭니다.");
    }

}
