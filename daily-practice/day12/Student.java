package day12;

public class Student {
    private String name;
    private int score;

    // 构造
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // 打印信息
    @Override
    public String toString() {
        return "Student{name='" + name + "', score=" + score + "}";
    }
}
