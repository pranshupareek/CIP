package Libraries.arrays;

import java.util.Arrays;

public class medianOfMatrix {
    static int matMed(int mat[][]){
        int r = mat.length;
        int c = mat[0].length;

        int min = mat[0][0], max = mat[0][c-1];
        for (int i = 1; i<r; i++){
            if (mat[i][0] < min){
                min = mat[i][0];
            }
            if (mat[i][c-1]>max){
                max = mat[i][c-1];
            }
        }
        int medPos = (r*c+1)/2;
        while (min<max){
            int mid = (min+max)/2, midPos = 0;
            for (int i = 0; i<r; i++){
                int pos = Arrays.binarySearch(mat[i], mid) + 1;
                midPos+=Math.abs(pos);
            }
            if (midPos<medPos){
                min = mid+1;
            }
            else {
                max = mid;
            }
        }
        return min;
    }

    public static void main(String arg[]){
        int mat[][] = {{1,2,3,4,5},{10,15,18,30,35},{7,8,9,11,26}};
        System.out.println(matMed(mat));
    }

}
