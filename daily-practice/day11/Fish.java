package day11;

public class Fish extends Animal implements Swimmable{
    public Fish(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " 吃水草");
    }


    @Override
    public void swim() {
        System.out.println(name + " 在水里游");
    }
}
