package week01_02.sub04;

public class Student {

    public int id;
    public String name;
    public int grade;

    public Student(){

    }

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void print(){
        System.out.println("학번: " + id);
        System.out.println("이름: " + name);
        System.out.println("학년: " + grade + "학년");
    }
}
