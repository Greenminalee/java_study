package week04.sub05;

public class Human extends Animal {
    Human()
    {
        this.name = "사람";
    }

    @Override
    void move() {
        System.out.println(name + "이 책을 읽습니다");
    }
}
