package week04.sub03;

public class Human extends Animal {
    Human()
    {
        this.name = "사람";
    }

    @Override
    void move() {
        System.out.println(name + "이 두발로 걷습니다.");
    }
}
