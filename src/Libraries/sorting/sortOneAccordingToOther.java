package Libraries.sorting;

import java.util.Arrays;
import java.util.Collections;

class my implements Comparable<my>{
    int a;
    char b;
    my(int x,char y){
        a=x;
        b=y;
    }
    public int compareTo(my P){
        return this.a - P.a;
    }
}

public class sortOneAccordingToOther {
    static char[] sortArray(int a[], char b[]){
        my myDS[] = new my[a.length];
        for (int i = 0; i< a.length; i++){
            myDS[i] = new my(a[i], b[i]);
        }
        Arrays.sort(myDS);
        for (int i=0; i< a.length; i++){
            b[i] = myDS[i].b;
        }
        return b;
    }

    public static void main(String arg[]){
        int a[] = {3,1,2};
        char b[] = {'G','E','K'};
        b = sortArray(a,b);
        System.out.println(b);
    }
}
