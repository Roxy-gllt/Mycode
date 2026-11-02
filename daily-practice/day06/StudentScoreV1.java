package day06;

import java.util.Scanner;

public class StudentScoreV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        int[] scores = new int[3];

        // 录入
        for (int i = 0; i < 3; i++) {
            System.out.print("请输入第"+(i+1)+"个学生姓名：");
            names[i] = sc.next();
            System.out.print("请输入成绩：");
            scores[i] = sc.nextInt();
        }

        // 计算最高分、平均分（复用ArrayUtil）
        int maxScore = ArrayUtil.getMax(scores);
        double avg = ArrayUtil.getAvg(scores);
        System.out.println("最高分：" + maxScore);
        System.out.println("平均分：" + avg);

        // 简单排名：复制数组排序，再比对输出
        int[] sortScore = scores.clone();
        ArrayUtil.bubbleSort(sortScore);
        System.out.println("成绩升序排序：");
        for(int s : sortScore){
            System.out.print(s + " ");
        }
        sc.close();
    }
}
