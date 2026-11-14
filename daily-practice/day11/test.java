package day11;

public class test {
    public static void main(String[] args) {
        Animal bird = new Bird("老鹰");
        bird.eat();
        bird.sleep();

        Animal fish = new Fish("金鱼");
        fish.eat();
        fish.sleep();

        Flyable f = new Bird("鸽子");
        f.fly();
        f.sayHello();
        Flyable.showInfo();

        Swimmable s = new Fish("鲤鱼");
        s.swim();
    }


}
