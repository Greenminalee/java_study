package week01_02.sub09;

public class Subway {

    public int num;
    public int money;
    public int passenger;
    public int income;

    public Subway(int num) {
        this.num = num;
        this.money = 1200;
    }

    public void takePassenger() {
        income = income + 1200;
        passenger = passenger + 1;
    }

    public void showSubwayInfo() {
        System.out.println(num + "번 지하철의 승객은 " + passenger + "명 이고, 수입은 " + income + "원 입니다.");
    }
}
