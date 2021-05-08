package DSAAdvance.backtracking;

import java.util.Arrays;

public class ratInMaze {
    static boolean isValid(int i, int j, int n, int m, int maze[][]){
        return i<n&&j<m&&maze[i][j]==1;
    }
    static boolean isPossible(int maze[][],int res[][]){
        int n = maze.length;
        int m = maze[0].length;
        int i = 0;
        int j = 0;
        if (isValid(i, j, n, m, maze)){
            return solveMaze(maze, res, i, j, n, m);
        }

        return false;
        

    }

    static boolean solveMaze(int maze[][], int res[][], int i, int j, int n, int m){
        if (i==n-1&&j==m-1){
            res[i][j] = 1;
            return true;
        }
        boolean right = false, down = false;
        if (isValid(i+1, j, n, m, maze)){
            right = solveMaze(maze, res, i+1, j, n, m);
        }
        if (!right&&isValid(i, j+1, n, m, maze)){
            down = solveMaze(maze, res, i, j+1, n, m);
        }
        if (right||down){
            res[i][j] = 1;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int maze[][] = {
            {1,0,1},
            {1,1,0},
            {0,1,1}
        };
        int res[][] = new int[3][3];
        int n = res.length;
        if (isPossible(maze, res)){
            System.out.println("YES");
            for (int i = 0; i<n; i++){
                System.out.println(Arrays.toString(res[i]));
            }
        }
        else{
            System.out.println("NO");
        }
    }
}
