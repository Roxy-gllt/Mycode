package day12;

public class MathUtil {
    private MathUtil(){}

    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static double avg(int[] arr){
        return sum(arr) / (double) arr.length;
    }
}
