package week05.sub01;

public class ManualCar extends Car{
    @Override
    void drive() {
        System.out.println("사람이 운접합니다");
        System.out.println("사람이 핸들을 조작합니다");
    }

    @Override
    void stop() {
        System.out.println("브레이크로 정지합니다");
    }
}
