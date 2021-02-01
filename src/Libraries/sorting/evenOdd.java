package Libraries.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class evenOdd implements Comparator<Integer> {
    public int compare(Integer x, Integer y){
        if (x%2==y%2){
            return x-y;
        }
        else if (x%2==0&&y%2==1){
            return -1;
        }
        else {
            return 1;
        }
    }
}
class main{
    public static void main(String arg[]){
        Integer arr[] = {5,8,3,1,4};
        Arrays.sort(arr, new evenOdd());
        System.out.println(Arrays.toString(arr));
    }
}
