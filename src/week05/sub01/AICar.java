package week05.sub01;

public class AICar extends Car{

    @Override
    void drive() {
        System.out.println("자율 주행 합니다");
        System.out.println("자동차가 스스로 방ㅎ량을 전환합니다");
    }

    @Override
    void stop() {
        System.out.println("스스로 멈춥니다");
    }


}
