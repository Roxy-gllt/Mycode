package day07;

// Student.java
public class Student {
    // 成员变量
    private String name;
    private int age;

    // 无参构造
    public Student() {
    }

    // 有参构造（构造重载）
    public Student(String name, int age) {
        // 名字冲突，必须this
        this.name = name;
        this.age = age;
    }

    // get、set、打印信息方法
    public void showInfo() {
        System.out.println("学生：" + name + "，年龄：" + age);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
