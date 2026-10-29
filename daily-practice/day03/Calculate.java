//package day03;
//
//import java.util.Scanner;
//
//public class Calculate {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入两个数字：");
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("输入+ - * /");
//        String operator = scanner2.next();
//
//        double result = 0;
//        boolean flag = true;
//        switch (operator) {
//            case "+":
//                result = a + b;
//                break;
//            case "-":
//                result = a - b;
//                break;
//            case "*":
//                result = a * b;
//                break;
//            case "/":
//                if (b != 0) {
//                    result = a / b;
//                } else {
//                    System.out.println("除数不能为0");
//                    flag = false;
//                }
//                break;
//            default:
//                System.out.println("输入的运算符错误");
//                flag = false;
//        }
//        if (flag) {
//            System.out.println("结果是：" + result);
//        }
//        scanner.close();
//        scanner2.close();
//    }
//}
package day03;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数字：");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("请输入运算符：");
        String operator = scanner.next();
        double result = 0;
        boolean flag = true;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("除数不能为0");
                    flag = false;
                }
                break;
            default:
                System.out.println("输入的运算符错误");
                flag = false;
        }
        if (flag) {
            System.out.println("结果是：" + result);
        }
        scanner.close();
    }
}

