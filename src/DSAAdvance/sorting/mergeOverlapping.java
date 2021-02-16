package DSAAdvance.sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class interval implements Comparable<interval>{
    int start, end;
    interval(int s, int e)
    {
        this.start = s;
        this.end = e;
    }

    @Override
    public int compareTo(interval arr) {
        return this.start-arr.start;
    }
}
public class mergeOverlapping {

    static void mergeOl(interval arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        ArrayList<interval> al = new ArrayList<>();
        int tempEnd = arr[0].end;
        int curStart = arr[0].start;
        for (int i = 0; i<n; i++){

            if (tempEnd>=arr[i].start){
                tempEnd = Math.max(tempEnd,arr[i].end);
            }
            else {
                interval t = new interval(curStart,tempEnd);

                al.add(t);
                tempEnd = arr[i].end;
                curStart = arr[i].start;
            }
        }
        interval t = new interval(curStart,tempEnd);
        al.add(t);

        for (interval x: al){
            System.out.println(x.start+" "+x.end);
        }
    }

    public static void main(String arg[]){
        interval arr[] = { new interval(25,26),new interval(3,15),new interval(18,30),
                new interval(2,7) };
        mergeOl(arr);
    }
}
