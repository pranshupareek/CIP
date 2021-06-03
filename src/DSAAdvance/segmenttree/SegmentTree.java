package DSAAdvance.segmenttree;

import java.util.Arrays;

public class SegmentTree {
    int st[];
    int n;
    SegmentTree(int arr[]){
        n = arr.length;
        st = new int[4*n];
        int ps[] = new int[n];
        ps[0] = arr[0];
        for (int i = 1; i<n; i++){
            ps[i] = ps[i-1]+arr[i];
        }

        makeST(st, ps, 0, n-1, 0);
    }

    private void makeST(int st[], int ps[], int i, int j, int cur){
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

    private int getSum(int ps[], int i, int j){
        if(i==0){
            return ps[j];
        }
        return ps[j]-ps[i-1];
    }
    public int[] getSt() {
        return st;
    }

    public int getSum(int i, int j){
        return getSumRec(i, j, 0, n-1, 0);
    }

    private int getSumRec(int qs, int qe, int ss, int se, int si){
        if (se<qs||ss>qe){
            return 0;
        }
        if (qs<=ss&&qe>=se){
            return st[si];
        }
        int mid = (ss+se)/2;
        return getSumRec(qs, qe, ss, mid, 2*si +1)+getSumRec(qs, qe, mid+1, se, 2*si+2);
    }

    public void update(int i, int val){
        int diff = val - getSum(i, i);
        updateRec(0,n-1,i,0,diff);
    }

    private void updateRec(int ss, int se, int i, int si, int diff){
        if (i<ss||i>se){
            return;
        }
        st[si]+=diff;
        if (se>ss){
            int mid = (ss+se)/2;
            updateRec(ss, mid, i, 2*si+1, diff);
            updateRec(mid+1, se, i, 2*si+2, diff);
        }
    }
}

class Main{
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        SegmentTree st = new SegmentTree(arr);
        System.out.println(Arrays.toString(st.getSt()));
        System.out.println(st.getSum(1, 2));
        st.update(1, 25);
        System.out.println(st.getSum(1, 2));
    }
}
