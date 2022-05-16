package week01_02.sub07;

public class Sub07 {

    private int id;
    private String student;

    public Sub07() {
        this(1, "홍길동");
        System.out.println(id);
    }

    public Sub07(int id) {
        this.id = id;
    }

    public Sub07(String student) {
        this.student = student;
    }

    public Sub07(int id, String student) {
        this.id = id;
        this.student = student;
    }

    public Sub07 test() {
        return this;
    }

    public void printThis(){
        System.out.println(this);
    }
}
