package DSAAdvance.hashing;

import java.util.HashSet;
import java.util.Set;

public class unionOfTwoArrays {
    static int getUnionCount(int a[], int b[]){
        int n = a.length;
        int m = b.length;
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i<n; i++){
            hs.add(a[i]);
        }
        for (int i = 0; i< m; i++){
            hs.add(b[i]);
        }
        return hs.size();
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = {1,4,5};
        System.out.println(getUnionCount(a,b));
    }
}
