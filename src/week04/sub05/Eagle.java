package week04.sub05;

public class Eagle extends Animal {
    Eagle()
    {
        this.name = "독수리";
    }

    @Override
    void move() {
        System.out.println(name + "날개를 쭉 펴고 멀리 날아 갑니다");
    }
}
