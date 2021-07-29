import java.util.Arrays;
import java.util.stream.IntStream;

public class SumTheArrayElements {
    public static void main(String[] args){
        int[] a = {3,6,8,12,9};
        method1(a);
        method2(a);
    }
    public static void method1(int[] a){
        int sum = 0;
        for (int n :a){
            sum+=n;
        }
        System.out.println("Sum of Array elements : "+sum);
    }
    public static void method2(int[] a){
        IntStream stream = Arrays.stream(a);
        int sum = stream.sum();
        System.out.println("Sum of Array Elements : "+sum);

    }

}
