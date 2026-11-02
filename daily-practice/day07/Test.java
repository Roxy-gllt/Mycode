package day07;

// TestOOP.java 测试主类
public class Test {
    public static void main(String[] args) {
        // 1. 创建5个Student对象，存入Student数组
        Student[] stuArr = new Student[5];
        stuArr[0] = new Student("张三", 18);
        stuArr[1] = new Student("李四", 19);
        stuArr[2] = new Student("王五", 18);
        stuArr[3] = new Student("赵六", 20);
        stuArr[4] = new Student("孙七", 19);

        // 遍历打印学生
        System.out.println("===== 学生列表 =====");
        for (Student s : stuArr) {
            s.showInfo();
        }

        // 2. 创建Teacher对象数组（可选，你可以再放5个老师）
        Teacher[] teaArr = new Teacher[3];
        teaArr[0] = new Teacher("王老师", "Java");
        teaArr[1] = new Teacher("李老师", "数学");
        teaArr[2] = new Teacher("陈老师", "英语");

        System.out.println("\n===== 老师列表 =====");
        for (Teacher t : teaArr) {
            t.showInfo();
        }
    }
}
