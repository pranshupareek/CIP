package DSAAdvance.backtracking;
import java.util.*;
public class nQueenProblem {
    static boolean isValid(int row, int col, int[] queen){
        for (int i = 0; i<col; i++){
            if (queen[i]==row){
                return false;
            }
        }

        for (int i = row, j = col; i>=0&&j>=0; j--,i--){
            if (queen[j]==i){
                return false;
            }
        }
        for (int i = row, j = col; i<queen.length&&j>=0; j--,i++){
            if (queen[j]==i){
                return false;
            }
        }

        return true;
    }
    static void nQueen(int n){
        int queen[] = new int[n];
        Arrays.fill(queen, -1);
        if (checkNQ(0,queen)){
            System.out.println("YES");
            for (int i = 0;i<n; i++){
                for (int j = 0; j<n; j++){
                    if (j==queen[i]){
                        System.out.print("1 ");
                    }
                    else {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }
        else{
            System.out.println("NO");
        }


    }

    static boolean checkNQ(int col, int[] queen){
        int n = queen.length;
        if (col==n){
            return true;
        }

        for (int i = 0; i<n; i++){
            if (isValid(i, col, queen)){
                queen[col] = i;
                if (checkNQ(col+1, queen)){
                    return true;
                }
                queen[col] = -1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        nQueen(5);
        nQueen(10);
        nQueen(3);
    }
}
