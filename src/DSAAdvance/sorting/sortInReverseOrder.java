package DSAAdvance.sorting;

import java.util.Arrays;
import java.util.Collections;

public class sortInReverseOrder {
    public static void main(String arg[]){
        Integer arr[] = {3,4,6,9};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
