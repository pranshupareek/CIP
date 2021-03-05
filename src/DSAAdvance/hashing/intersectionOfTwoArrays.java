package DSAAdvance.hashing;

import java.util.HashSet;
import java.util.Set;

public class intersectionOfTwoArrays {
    static int getSizeOfIntersection(int a[], int b[]){
        int n = a.length;
        int m = b.length;
        Set<Integer> hs = new HashSet<>();
        for (int i = 0;i<n; i++){
            hs.add(a[i]);
        }
        int count = 0;
        for (int i = 0; i<m; i++){
            if (hs.contains(b[i])){
                count++;
                hs.remove(b[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {10, 15, 20, 15, 30, 30, 5};
        int arr2[] = {30, 5, 30, 80};
        System.out.println(getSizeOfIntersection(arr,arr2));
    }
}
