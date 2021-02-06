package DSAAdvance.arrays;

import java.util.ArrayList;

public class minGroupFlip {
    static void printMinFlip(int arr[]){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(arr[0]);
        for (int i = 1; i < arr.length; i++){
            if (arr[i]!=arr[i-1]){
                al.add(i);
            }
        }
        if (al.size()==1){
            return;
        }
        for (int i = (al.size()&1); i< al.size(); i+=2){
            System.out.println("From "+al.get(i)+" to "+(al.get(i+1)-1));
        }
    }
    public static void main(String arg[]){
        int arr[] = {1,0,0,0,1,0,0,1,1};
        printMinFlip(arr);
    }
}
