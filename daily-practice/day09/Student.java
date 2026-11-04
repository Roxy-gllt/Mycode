package day09;

import java.util.Objects;

public class Student extends Person{
    private String studentId; // 学号：判断相等的依据

    public Student() {
        super(); // 可以省略，编译器自动加
    }

    public Student(String name, int age, String studentId) {
        super(name,age); // 调用父类有参构造，放在第一行
        this.studentId = studentId;
    }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", studentId='" + studentId + '\'' +
                '}';
    }

    // 重写equals：学号相同就是同一个学生（重点）
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    // 重写hashCode，和equals使用相同字段
    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
