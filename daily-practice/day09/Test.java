package day09;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18, "2026001");
        Student s2 = new Student("张三", 18, "2026001");
        Student s3 = new Student("李四", 18, "2026002");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2)); // true，学号一样
        System.out.println(s1.equals(s3)); // false
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode()); // 和s1哈希值相同
    }
}
