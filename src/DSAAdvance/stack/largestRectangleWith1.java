package DSAAdvance.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class largestRectangleWith1 {
    static int getLongestRectangle(int mat[][]){
        int r = mat.length;
        int c = mat[0].length;
        for (int i = 0; i<c; i++){
            for (int j = 1; j<r; j++){
                if (mat[j][i]!=0)
                    mat[j][i] += mat[j-1][i];
            }
        }
        Deque<Integer> stack = new ArrayDeque<>();
        int res = 0,cur = 0;
        for (int i = 0; i<r; i++){
            for (int j = 0; j<c; j++){
                while(!stack.isEmpty()&&mat[i][stack.peek()]>mat[i][j]){
                    int pop = stack.pop();
                    cur = mat[i][pop]*(j-pop);
                    res = Math.max(res, cur);
                }
                stack.push(j);
            }
            while(!stack.isEmpty()){
                int pop = stack.pop();
                cur = mat[i][pop]*(c-pop);
                res = Math.max(res, cur);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int mat[][] = {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
        System.out.println(getLongestRectangle(mat));
    }
}
