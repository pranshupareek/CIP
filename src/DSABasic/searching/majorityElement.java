package DSABasic.searching;
import java.util.*;
import java.io.*;
import java.lang.*;

public class majorityElement {
    //Initial Template for Java

    static class Geeks
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while(t-- > 0)
            {
                int n =sc.nextInt();
                int arr[] = new int[n];

                for(int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();

                System.out.println(new Majority().majorityElement(arr, n));
            }
        }
    }// } Driver Code Ends


    //User function Template for Java
    static class Majority
    {
        static int majorityElement(int arr[], int size)
        {
            // your code here
            HashMap<Integer, Integer> h= new HashMap<Integer, Integer>();
            for (int i = 0; i<arr.length; i++){
                if (h.containsKey(arr[i])){
                    int temp = h.get(arr[i]);
                    h.put(arr[i], temp+1);
                    if ((size/2)<temp+1)
                        return arr[i];
                }
                else {
                    h.put(arr[i], 1);
                    if ((size/2)<1)
                        return arr[i];
                }
            }
            return -1;

        }
    }
}
