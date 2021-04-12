package cc.longApril;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Codechef
{
    static void printMat(int mat[][], int n, int m){
        System.out.println("\n Matrix: ");
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    static void makePrefix(int mat[][],int n, int m){
        for (int i = 0; i<n; i++){
            int prev = 0;
            for (int j = 0; j<m; j++){
                mat[i][j] = mat[i][j]+prev;
                prev = mat[i][j];
            }
        }
        for (int i = 0; i<m; i++){
            int prev = 0;
            for (int j = 0; j<n; j++){
                mat[j][i] = mat[j][i]+prev;
                prev = mat[j][i];
            }
        }
        
    }
    
    static int getSum(int mat[][], int i1, int j1, int i2, int j2){
        int sum;
        if (i1==0&&j1==0){
            sum = mat[i2][j2];
        }
        else if (i1==0){
            sum = mat[i2][j2]-mat[i2][j1-1];
        }
        else if (j1==0){
            sum = mat[i2][j2]-mat[i1-1][j2];
        }
        else {
            sum = mat[i2][j2]-mat[i2][j1-1]-mat[i1-1][j2]+mat[i1-1][j1-1];
        }
        return sum;
    }

    
    static int getWorthy(int mat[][], int n, int m, int k){
        int count=0;
        makePrefix(mat, n, m);
        int passPair[][] = new int[n][m];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                int sum = getSum(mat, i, j, i, j);
                if (sum<k){
                    passPair[i][j] = 0;
                }
                else {
                    passPair[i][j] = 1;
                    if (i==0||j==0){
                        continue;
                    }
                    int iDash = i-1;
                    int jDash = j-1;
                    int pvs = passPair[iDash][jDash];
                    passPair[i][j]+=pvs;
                    iDash-=pvs;
                    jDash-=pvs;
                    if (iDash<0||jDash<0){
                        continue;
                    }
                    int avg = getSum(mat, iDash, jDash, i, j)/((i-iDash+1)*(i-iDash+1));
                    while (avg>=k){
                        passPair[i][j]++;
                        iDash--;
                        jDash--;
                        if (iDash<0||jDash<0){
                            break;
                        }
                        avg = getSum(mat, iDash, jDash, i, j)/((i-iDash+1)*(i-iDash+1));
                    }
                }
                count+=passPair[i][j];
            }
        }
        return count;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		    int testCase = s.nextInt();
		    while (testCase-->0){
		        int n = s.nextInt();
		        int m = s.nextInt();
		        int k = s.nextInt();
		        int mat[][] = new  int[n][m];
		        for (int i = 0; i<n; i++)
		            for (int j = 0; j<m; j++){
		                mat[i][j] = s.nextInt();
		            }
		        
		        int res = getWorthy(mat,n,m,k);
		        System.out.println(res);
	    }
    }
}
