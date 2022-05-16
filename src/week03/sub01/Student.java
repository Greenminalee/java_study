package week03.sub01;

public class Student {
    public String studentName;
    private static int serialNum = 1000;
    public int studentID;
    public Student()
    {
        studentID = ++this.serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
