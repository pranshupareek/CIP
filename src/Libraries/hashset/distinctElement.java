package Libraries.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class distinctElement {
    static void printDistinct(int arr[]){
        HashSet<Integer> hs = new LinkedHashSet<>();
        for (int x: arr){
            hs.add(x);
        }
        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }

    public static void main(String arg[]){
        int arr[] = {10,20, 30, 20, 10};
        printDistinct(arr);
    }
}
