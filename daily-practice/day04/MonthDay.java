package day04;

import java.util.Scanner;

public class MonthDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        int days = switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> -1;
        };
        if(days == -1){
            System.out.println("输入的月份有误");
        }else {
            System.out.println("该月份有" + days + "天");
        }
        scanner.close();
    }
}
