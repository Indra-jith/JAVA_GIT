import java.util.*;

@FunctionalInterface
interface minMax {
    public void getMinAndMax(int arr[]);
}

public class lamba_prac {
    public static void main(String[] args) {
        minMax p4 = (int arr[]) -> {
            Arrays.sort(arr);
            System.out.println("The largest element is :" + arr[arr.length - 1]);
            System.out.println("The smallest element is :" + arr[0]);
        };
        int arr[] = { 6, 10, 19, 7, 65, 4 };
        p4.getMinAndMax(arr);
    }
}
