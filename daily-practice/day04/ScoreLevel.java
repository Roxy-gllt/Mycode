package day04;

import java.util.Scanner;

public class ScoreLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = scanner.nextInt();
        if(score >= 90 && score <= 100){
            System.out.println("等级为A");
        }
        else if(score >= 75 && score <= 89){
            System.out.println("等级为B");
        }
        else if(score >= 60 && score <= 74){
            System.out.println("等级为C");
        }
        else if(score >= 0 && score <= 59){
            System.out.println("等级为D");
        }
        else{
            System.out.println("输入的分数有误");
        }
        scanner.close();
    }
}
