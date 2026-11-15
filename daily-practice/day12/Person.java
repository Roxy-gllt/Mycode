package day12;

public class Person {
    public static int count = 0;

    // 实例代码块：每次new对象的时候执行，构造方法之前执行
    {
        count++;
        System.out.println("实例代码块执行，当前new数量：" + count);
    }

    // 静态代码块：类加载的时候【只执行一次】
    static {
        System.out.println("静态代码块：Person类被加载了！");
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
