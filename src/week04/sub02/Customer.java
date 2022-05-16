package week04.sub02;

public class Customer {
    int id;
    String name;
    String grade;
    int bonusPoint;

    Customer(int id, String name)
    {
        this.name = name;
        this.id = id;
        this.grade = "silver";
    }

    String showCustomerInfo()
    {
        return (name + "님의 등급은 " + grade + "이며, " + "보너스 포인트는 " + bonusPoint + "입니다");

    }
    int calcPrice(int price)
    {
        if (this.grade == "VIP") {
            bonusPoint += (price * 0.05);
            return (price - price / 10);
        }
        else {
            bonusPoint += (price * 0.01);
            return (price);
        }
    }
}
