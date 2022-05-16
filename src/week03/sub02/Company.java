package week03.sub02;

public class Company {
    private static Company instance = new Company();
    private Company(){

    }
        
    public static Company getInstance() {
        return instance;
    }

}
