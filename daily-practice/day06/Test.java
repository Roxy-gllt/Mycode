package day06;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,8,4,5,1};

        System.out.println("去重后数组为");
        ArrayUtil.printArray(ArrayUtil.distinct(arr));
        System.out.println("冒泡排序");
        ArrayUtil.printArray(arr);
        System.out.println("二分查找");
        System.out.println("下标是"+ArrayUtil.binarySearchAll(arr, 1));
    }
}
