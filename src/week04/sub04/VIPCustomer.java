package week04.sub04;

public class VIPCustomer extends Customer {

    VIPCustomer(int id, String name) {
        super(id, name);
        this.grade = "VIP";
    }
}
