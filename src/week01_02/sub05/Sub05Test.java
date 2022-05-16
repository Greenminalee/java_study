package week01_02.sub05;

public class Sub05Test {
    public static void main(String[] args) {
        Sub05 sub05 = new Sub05("제인");
        sub05.age = 30;
        sub05.gender = "여성";
        sub05.marry = "기혼자";
        sub05.kidsNum = 1;

        sub05.print();
    }
}
