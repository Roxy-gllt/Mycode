package day10;

public class Test {
    public static void main(String[] args) {
        Person[] arr = {
                new Student(),
                new Teacher()
        };

        for (Person p : arr){
            p.work();

            if(p instanceof Student){
                Student s = (Student) p;
                s.study();
            } else if (p instanceof Teacher) {
                Teacher t = (Teacher) p;
                t.teach();
            }
        }
    }
}
