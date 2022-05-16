package week04.sub02;

import week04.sub02.Customer;

public class VIPCustomer extends Customer {

    VIPCustomer(int id, String name) {
        super(id, name);
        this.grade = "VIP";
    }
}
