package DSAAdvance.bst;

import java.util.TreeSet;

public class ceilingOfLeft {
    static void printCeiling(int arr[]){
        int n = arr.length;
        System.out.print("-1 ");
        TreeSet<Integer> bst = new TreeSet<>();
        bst.add(arr[0]);
        for (int i = 1; i<n; i++){
            if (bst.ceiling(arr[i])!=null){
                System.out.print(bst.ceiling(arr[i])+" ");
            }
            else {
                System.out.print("-1 ");
            }
            bst.add(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={2,8,30,15,25,12};
	    printCeiling(arr);
    }
}
