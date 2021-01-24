package Libraries.generics;

import java.util.*;

class MyGen<T> {
    T x;
    static int count;
    MyGen()
    {
        count++;
    }
}
public class Test
{
    public static void main(String[] args)
    {
        MyGen<Integer> m1 = new MyGen<>();

        MyGen<Integer> m2 = new MyGen<>();

        System.out.println(MyGen.count);
    }
}