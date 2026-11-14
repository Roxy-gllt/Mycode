package day11;

public interface Flyable {
    void fly();

    default void sayHello(){
        System.out.println("i can fly");
    }

    static void showInfo(){
        System.out.println("这是静态方法");
    }
}
