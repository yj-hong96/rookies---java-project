package lab.student.entity;
public class Student {
    private String studentId;
    private String name;
    private String major;
    private int grade;

    public Student(String studentId, String name, String major, int grade) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        setGrade(grade);
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getMajor() { return major; }
    public int getGrade() { return grade; }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 4) {
            this.grade = grade;
        } else {
            System.out.println("�г�(Grade)�� 1~4 �����̾�� �մϴ�!!");
        }
    }
}