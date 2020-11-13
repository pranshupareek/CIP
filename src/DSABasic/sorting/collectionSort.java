package DSABasic.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Point {
    int x,y;
    Point(int i, int j){
        x=i;
        y=j;
    }
}

class MySort implements Comparator<Point>
{
    public int compare(Point a, Point b)
    {
        return (a.x - b.x);
    }
}

public class collectionSort {
    public static void main(String arg[]){
        ArrayList<Point>a = new ArrayList<Point>();
        a.add(new Point(10,20));
        a.add(new Point(3,12));
        a.add(new Point(5,7));

        Collections.sort(a,new MySort());
        for (int i=0; i<a.size(); i++){
            System.out.println(a.get(i).x+" "+a.get(i).y);
        }
    }

}
