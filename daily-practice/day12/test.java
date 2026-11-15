package day12;

public class test {
    public static void main(String[] args) {
        Person p1 = new Person("张三");
        Person p2 = new Person("李四");
        Person p3 = new Person("王五");

        System.out.println("一共创建Person对象数量：" + Person.count);

        // 匿名内部类：没有名字，直接new接口/抽象类，重写方法
        Hello h = new Hello() {
            @Override
            public void sayHi() {
                System.out.println("匿名内部类打招呼");
            }
        };
        h.sayHi();
    }
}
