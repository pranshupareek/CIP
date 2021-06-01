package DSAAdvance.segmenttree;

import java.util.Arrays;

public class SegmentTree {
    int st[];
    SegmentTree(int arr[]){
        int n = arr.length;
        st = new int[4*n];
        int ps[] = new int[n];
        ps[0] = arr[0];
        for (int i = 1; i<n; i++){
            ps[i] = ps[i-1]+arr[i];
        }

        makeST(st, ps, 0, n-1, 0);
    }

    void makeST(int st[], int ps[], int i, int j, int cur){
        if (i==j){
            st[cur]=getSum(ps, i, j);
            return; 
        }
        st[cur] = getSum(ps, i, j);
        int mid =i + (j-i)/2;
        int child = (cur*2)+1;
        makeST(st, ps, i, mid, child);
        makeST(st, ps, mid+1, j, child+1);
    }

    int getSum(int ps[], int i, int j){
        if(i==0){
            return ps[j];
        }
        return ps[j]-ps[i-1];
    }
    public int[] getSt() {
        return st;
    }
}

class main{
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        SegmentTree st = new SegmentTree(arr);
        System.out.println(Arrays.toString(st.getSt()));
    }
}
