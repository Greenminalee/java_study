package week01_02.sub09;

public class Student {

    public String name;
    public int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus){
        money = money - bus.money;
        bus.takePassenger();
    }

    public void takeSubway(Subway subway){
        money = money - subway.money;
        subway.takePassenger();
    }

    public void showInfo() {
        System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
