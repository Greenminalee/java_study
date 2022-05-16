package week01_02.sub08;

public class Student {

    int studentID;
    String studentName;
    Subject subject;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.subject = new Subject();
    }

    public void setKorean(String korean, int grade){
        this.subject.koreaSubject = korean;
        this.subject.koreaScore = grade;
    }

    public void setMath(String math, int grade){
        this.subject.mathSubject = math;
        this.subject.mathScore = grade;
    }

    public void showStudentInfo()
    {
        System.out.println("학생" + studentName + "의 총점은 " + (subject.mathScore + subject.koreaScore) + " 입니다");
    }
}
