package week04.sub04;

import week04.sub03.Animal;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer(10001, "이순신");
        Customer customer2 = new Customer(10002, "심사임당");
        Customer customer3 = new GoldCustomer(10003, "이율곡");
        Customer customer4 = new VIPCustomer(10004, "김유신");
        ArrayList<Customer> CustomerList = new ArrayList<Customer>();
        CustomerList.add(customer1);
        CustomerList.add(customer2);
        CustomerList.add(customer3);
        CustomerList.add(customer4);
        System.out.println("===========고객 정보 출력============");
        for (Customer c : CustomerList)
            System.out.println(c.showCustomerInfo());
        System.out.println("===========할인율과 보너스 포인트 계산============");
        for (Customer c : CustomerList) {
            System.out.println(c.name + " 님이 " + c.calcPrice(10000) + "원 지불하셨습니다");
            System.out.println(c.name + " 님의 현재 보너스 포인트는 " + c.bonusPoint + "점 입니다" );
        }
    }
}