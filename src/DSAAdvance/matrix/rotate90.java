import java.util.*;

public class rotate90 {
    public static void swap(int arr[][],int r1, int c1, int r2, int c2){
        int temp = arr[r1][c1];
        arr[r1][c1] = arr[r2][c2];
        arr[r2][c2] = temp;
    }
    public static void makeTranspose(int arr[][]) {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i<r; i++) {
            for (int j = i+1; j<c; j++) {
                swap(arr,i,j,j,i);
            }
        }
    }   
    static void rotateArray(int arr[][]){
        makeTranspose(arr);
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i<r/2; i++) {
            for (int j = 0; j<c; j++) {
                swap(arr, i, j, r-i-1, j);
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotateArray(arr);
        for (int i = 0; i<arr.length; i++)
        System.out.println(Arrays.toString(arr[i]));
    }
    
}
