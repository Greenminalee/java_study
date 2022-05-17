package week04.sub05;

public class Tiger extends Animal {
    Tiger()
    {
        this.name = "호랑이";
    }

    @Override
    void move() {
        System.out.println(name + "네발로 뚭니다.");
    }

    void act() {
        System.out.println(name + "사냥을 합니다");
    }

}
