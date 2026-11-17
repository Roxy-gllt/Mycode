package day13;

public class StringToolTest {
    public static String reverse(String str){
        if(str == null || str.length() <=1){
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static int countChar(String str, char c){
        if(str == null){
            return 0;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String testStr = "hello java string";
        System.out.println("反转：" + reverse(testStr));
        System.out.println("字符a出现次数：" + countChar(testStr, 'a'));

        int loop = 100000;

        // String + 拼接
        long start1 = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < loop; i++) {
            s += "a";
        }
        long end1 = System.currentTimeMillis();
        System.out.println("String + 耗时：" + (end1 - start1) + " ms");

        // StringBuilder拼接
        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < loop; i++) {
            sb.append("a");
        }
        String res = sb.toString();
        long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder 耗时：" + (end2 - start2) + " ms");
    }
}
