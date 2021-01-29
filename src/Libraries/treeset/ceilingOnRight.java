package Libraries.treeset;

import java.util.TreeSet;

public class ceilingOnRight {
    static void printCeilingOnRight(int arr[]){
        int n = arr.length;
        TreeSet<Integer> s = new TreeSet<Integer>();
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            Integer ceil = s.ceiling(arr[i]);
            if (ceil == null)
                res[i] = -1;
            else
                res[i] = ceil;
            s.add(arr[i]);
        }

        for(int x: res)
        {
            System.out.print(x+" ");
        }
    }

    public static void main(String arg[]){
        int arr[] = {10,100,200,30,120,120};
        printCeilingOnRight(arr);
    }
}
