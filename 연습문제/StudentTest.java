package lab.student.control;

import lab.student.entity.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("2023001", "��μ�", "��ǻ�Ͱ���", 3);
        System.out.println(s.getName() + " / " + s.getMajor() + " / " + s.getGrade() + "�г�" );
        System.out.println("5�г����� ���� ");
        s.setGrade(5); // ���� ���
        
    }
}