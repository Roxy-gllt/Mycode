package day14;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class test {
    public static void main(String[] args) {

        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); // true，缓存里同一个对象

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d); // false，新建两个不同对象
        System.out.println(c.equals(d)); // true，数值相等



        // double测试
        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println(d1 + d2); // 输出 0.30000000000000004，不是0.3

        // BigDecimal正确写法：优先用字符串构造，不要传double！
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        BigDecimal res = b1.add(b2);
        System.out.println(res); // 0.3



        // 1. 定义格式化模板，模板只写一次，可复用
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // String → LocalDateTime：解析
        String dateStr = "2026-11-21 18:30:00";
        LocalDateTime dateTime = LocalDateTime.parse(dateStr, formatter);
        System.out.println("解析后的时间：" + dateTime);

        // LocalDateTime → String：格式化输出
        String outStr = dateTime.format(formatter);
        System.out.println("格式化字符串：" + outStr);
    }
}
