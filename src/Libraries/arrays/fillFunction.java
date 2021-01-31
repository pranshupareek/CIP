package Libraries.arrays;

import java.util.Arrays;

public class fillFunction {
    public static void main(String arg[]){
        int arr[] = {10, 20, 30, 40};
        Arrays.fill(arr, -1);
        System.out.println(Arrays.toString(arr));
    }
}
