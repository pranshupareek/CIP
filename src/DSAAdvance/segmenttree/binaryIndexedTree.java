package DSAAdvance.segmenttree;

import java.util.*;

public class binaryIndexedTree {
    public int arr[];
    int myArr[];
    int n;
    binaryIndexedTree(int n){
        arr = new int[n+1];
        myArr = new int[n];
        this.n = n;
    }
    int getSum(int n){
        int res = 0;
        int index = 0;
        while(n>0){
            int sub = highestPowerOf2(n);
            index+= sub;
            res+= arr[index];
            n-=sub;
        }
        return res;
    }

    void updateUtil(int i, int diff){
        int index = i+1;
        while(index<=n){
            arr[index]+=diff;
            index+= index&(-index);
        }
    }
    
    void update(int i, int val){
        int diff = val-myArr[i];
        updateUtil(i, diff);
        myArr[i] = val;
    }
    int highestPowerOf2(int x)
    {
        // check for the set bits
        x |= x >> 1;
        x |= x >> 2;
        x |= x >> 4;
        x |= x >> 8;
        x |= x >> 16;
        
        // Then we remove all but the top bit by xor'ing the
        // string of 1's with that string of 1's shifted one to
        // the left, and we end up with just the one top bit
        // followed by 0's.
        return x ^ (x >> 1); 
    }
}

class Mains{
    public static void main(String[] args) {
        // int arr[] = {0,1,3,3,10,5,11,7,36,9,19,11,42,13};
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        binaryIndexedTree bit = new binaryIndexedTree(arr.length);
        for (int i = 0; i<arr.length; i++){
            bit.update(i, arr[i]);
        }

        System.out.println(bit.getSum(7));
        System.out.println(Arrays.toString(bit.arr));
    }
}