package week01_02.sub09;

public class Bus {

    public int num;
    public int money;
    public int passenger;
    public int income;

    public Bus(int num) {
        this.num = num;
        this.money = 1000;
    }

    public void takePassenger() {
        income = income + 1000;
        passenger = passenger + 1;
    }

    public void showBusInfo(){
        System.out.println(num + "번 버스의 승객은 " + passenger + "명 이고, 수입은 " + income + "원 입니다.");
    }
}
