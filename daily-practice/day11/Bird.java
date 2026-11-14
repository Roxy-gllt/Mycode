package day11;

public class Bird extends Animal implements Flyable{
    public Bird(String name){
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(name + "吃虫子");
    }

    @Override
    public void fly() {
        System.out.println(name + "在天上飞");
    }
}
