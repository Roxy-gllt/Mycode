package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentScoreV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 集合，动态存储学生
        ArrayList<Student> stuList = new ArrayList<>();

        while (true) {
            System.out.println("\n===== 学生成绩管理 =====");
            System.out.println("1. 添加学生");
            System.out.println("2. 查询全部学生");
            System.out.println("3. 修改学生成绩");
            System.out.println("4. 删除学生（按姓名）");
            System.out.println("5. 统计最高分、平均分");
            System.out.println("6. 按成绩升序展示");
            System.out.println("0. 退出");
            System.out.print("请输入功能编号：");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    // 增
                    System.out.print("请输入学生姓名：");
                    String addName = sc.next();
                    System.out.print("请输入成绩：");
                    int addScore = sc.nextInt();
                    stuList.add(new Student(addName, addScore));
                    System.out.println("添加成功！");
                    break;
                case 2:
                    // 查全部
                    if (stuList.isEmpty()) {
                        System.out.println("暂无学生数据");
                        break;
                    }
                    for (Student s : stuList) {
                        System.out.println(s);
                    }
                    break;
                case 3:
                    // 改：根据姓名修改成绩
                    System.out.print("输入要修改的学生姓名：");
                    String updateName = sc.next();
                    boolean found = false;
                    for (Student s : stuList) {
                        if (s.getName().equals(updateName)) {
                            System.out.print("输入新成绩：");
                            int newScore = sc.nextInt();
                            s.setScore(newScore);
                            System.out.println("修改完成");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("没有找到该学生");
                    }
                    break;
                case 4:
                    // 删
                    System.out.print("输入要删除的学生姓名：");
                    String delName = sc.next();
                    for (int i = 0; i < stuList.size(); i++) {
                        Student s = stuList.get(i);
                        if (s.getName().equals(delName)) {
                            stuList.remove(i);
                            System.out.println("删除成功");
                            break;
                        }
                    }
                    break;
                case 5:
                    // 最高分、平均分（对应原来逻辑）
                    if (stuList.isEmpty()) {
                        System.out.println("暂无数据");
                        break;
                    }
                    int max = stuList.get(0).getScore();
                    int sum = 0;
                    for (Student s : stuList) {
                        sum += s.getScore();
                        if (s.getScore() > max) {
                            max = s.getScore();
                        }
                    }
                    double avg = sum / (double) stuList.size();
                    System.out.println("最高分：" + max);
                    System.out.println("平均分：" + avg);
                    break;
                case 6:
                    // 成绩升序（不破坏原集合，新建临时集合排序）
                    if (stuList.isEmpty()) {
                        System.out.println("暂无数据");
                        break;
                    }
                    ArrayList<Student> temp = new ArrayList<>(stuList);
                    // 冒泡排序
                    for (int i = 0; i < temp.size() - 1; i++) {
                        for (int j = 0; j < temp.size() - 1 - i; j++) {
                            if (temp.get(j).getScore() > temp.get(j + 1).getScore()) {
                                Student t = temp.get(j);
                                temp.set(j, temp.get(j + 1));
                                temp.set(j + 1, t);
                            }
                        }
                    }
                    System.out.println("升序结果：");
                    for (Student s : temp) {
                        System.out.println(s);
                    }
                    break;
                case 0:
                    System.out.println("程序退出");
                    sc.close();
                    return;
                default:
                    System.out.println("输入错误，请重新选择");
            }
        }
    }
}
