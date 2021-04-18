package CodeJam.io.q3;

import java.util.*;

public class Solution {

    static ArrayList<Integer> getAL(String str){
        ArrayList<Integer> al = new  ArrayList<>();
        boolean I = true;
        int n = str.length();
        for (int i = 0; i<n; ){
            if ('I'==str.charAt(i)){
                int count = 0;
                while (i<n&&'I'==str.charAt(i)){
                    i++;
                    count++;
                }
                al.add(count);
            }
            if (i==n){
                break;
            }
            int count=0;
            while (i<n&&'O'==str.charAt(i)){
                i++;
                count++;
            }
            al.add(count);
        }
        return al;
    }
    static void getRes(String str){
        ArrayList<Integer> al = getAL(str);
        int n = al.size();
        int left = 0;
        int right = n-1;
        ArrayList<Integer> index = new ArrayList<>();
        System.out.println(al);
        for (int i = 0; i<n; i++){
            if (al.get(i)>1){
                index.add(i);
            }
        }

        int len = index.size();

        int winIndex;
        if (index.get(0)>len-1-index.get(len-1)){
            winIndex = index.get(0);
        }
        else  {
            winIndex = index.get(len-1);
        }

        if ()

        while (left<right){
            if (left%2==right%2){
                if (al.get(left)>1||al.get(right)>1){
                    break;
                }
                else {
                    left++;
                    right--;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for (int testCase = 1; testCase<=t; testCase++){
            String str = s.next();
            System.out.print("Case #"+testCase+": ");
            getRes(str);
        }
    }
}
