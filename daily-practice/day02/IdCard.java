package day02;

public class IdCard{
    public String name;
    private int age;
    public double height;
    public String atschool;

    public IdCard(String name, double height, String atschool){
        this.name = name;
        this.height = height;
        this.atschool = atschool;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setAtschool(String atschool){
        this.atschool = atschool;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getHeight(){
        return (int) this.height;
    }
    public String getAtschool(){
        return this.atschool;
    }
    public double getAge(){
        return this.age;
    }

    public static void main(String[] args) {
        IdCard idCard = new IdCard("张三", 1.75, "是");
        idCard.setAge(18);

        int num = 10;
        double num1 = num;
        System.out.println(num + "自动转换 int→double" + num1);

        double d = 10.0;
        int num2 = (int) d;
        System.out.println(d + "自动转换 double→int" + num2);
        System.out.println(idCard.getName() + " " + idCard.getAge() + " " + idCard.getHeight() + " " + idCard.getAtschool());
    }
}

