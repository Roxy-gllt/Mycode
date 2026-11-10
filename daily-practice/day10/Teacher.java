package day10;

public class Teacher extends Person{
    @Override
    public void work(){
        System.out.println("老师在讲课");
    }
    public void teach(){
        System.out.println("讲题");
    }
}
