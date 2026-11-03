//package day06;
//
//import java.util.ArrayList;
//import java.util.LinkedHashSet;
//import java.util.List;
//
//public class MyArray {
//    // 打印数组
//    public static void printArray(int[] arr){
//        System.out.println("[");
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//            if(i < arr.length-1){
//                System.out.println(",");
//            }
//        }
//        System.out.println("]");
//    }
//    // 最大值
//    public static int getMax(int[] arr){
//        int max = 0;
//        for(int i = 0; i < arr.length; i++){
//            max = Math.max(arr[i] , max);
//        }
//        return max;
//    }
//    // 最小值
//    public static int getMin(int[] arr){
//        int min = 0;
//        for(int i = 0; i < arr.length; i++){
//            min = Math.min(arr[i] , min);
//        }
//        return min;
//    }
//    // 平均值
//    public static double getAvg(int[] arr){
//        double sum = 0;
//        for (int n = 0; n < arr.length; n++){
//            sum += arr[n];
//        }
//        return sum/arr.length;
//    }
//    // 原地反转
//    public static void reverse(int[] arr){
//        int left = 0;
//        int right = arr.length-1;
//        while (left < right){
//            int temp = arr[right];
//            arr[left] = arr[right];
//            arr[right] = arr[left];
//            left++;
//            right--;
//        }
//    }
//    // 去重（int数组）
//    public static int[] distinct(int[] arr){
//        LinkedHashSet<Integer> set = new LinkedHashSet<>();
//        for(int num : arr){
//            set.add(num);
//        }
//        int[] res = new int[set.size()];
//        int index = 0;
//        for(Integer num : set){
//            res[index] = num;
//            index++;
//        }
//        return res;
//    }
//    //冒泡排序
//    public static void bubbleSort(int[] arr){
//        for(int i = 0; i < arr.length-1; i++){
//            boolean swapped =false;
//            for(int j = 0; j < arr.length-1-i; j++){
//                if(arr[j] > arr[j + 1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            if (!swapped){
//                break;
//            }
//        }
//    }
//    //二分查找
//    public static List<Integer> binarySearchAll(int[] arr, int target) {
//        ArrayUtil.bubbleSort(arr);
//        List<Integer> indexes = new ArrayList<>();
//        int left = 0;
//        int right = arr.length-1;
//        while (left <= right){
//            int mid = left + (right - left)/2;
//            if(arr[mid] == target){
//                indexes.add(mid);
//                // 向左扩展收集所有等于target的下标
//                for(int i = mid - 1; i >= 0 && arr[i] == target; i--){
//                    indexes.add(i);
//                }
//                // 向右扩展
//                for(int i = mid + 1; i < arr.length && arr[i] == target; i++){
//                    indexes.add(i);
//                }
//                break;
//            }else if(arr[mid] < target){
//                left = mid + 1;
//            }else {
//                right = mid - 1;
//            }
//        }
//        return indexes;
//    }
//}
