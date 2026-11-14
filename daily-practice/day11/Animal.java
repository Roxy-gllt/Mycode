package day11;

abstract class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void eat();

    public void sleep(){
        System.out.println(name + "sleep");
    }
}
