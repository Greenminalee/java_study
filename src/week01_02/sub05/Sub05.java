package week01_02.sub05;

public class Sub05 {

    public String tribe;
    public String name;
    public int age;
    public String gender;
    public String marry;
    public int kidsNum;

    public Sub05(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("이름은" + name + "이고 나이는 " + age + "살 입니다.\n 성별은 " + gender + "이며, " + marry + "입니다." +
                "자녀는 " + kidsNum + "명이 있습니다." );
    }
}
