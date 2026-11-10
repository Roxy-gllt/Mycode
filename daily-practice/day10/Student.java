package day10;

public class Student extends Person{
    @Override
    public void work(){
        System.out.println("学生在学习");
    }
    public void study(){
        System.out.println("写题");
    }
}
