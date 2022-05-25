package week05.sub02;

abstract class Car {
    public void startCar()
    {
        System.out.println("시동을 켭니다");
    }
    abstract void drive();
    abstract void stop();

    void turnOff()
    {
        System.out.println("시동을 끕니다");
    }
    void run()
    {
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }

    void wiper(){}

}
