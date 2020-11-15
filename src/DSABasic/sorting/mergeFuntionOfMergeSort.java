package DSABasic.sorting;

public class mergeFuntionOfMergeSort {
    public static void merge(int[] arr, int l, int m, int r){
        int[] a = new int[m-l+1];
        int[] b = new int[r-m];
        for (int i = 0; i< m-l+1; i++){
            a[i] = arr[i];
        }
        for (int i = 0; i< r-m; i++){
            b[i] = arr[i+m+1];
        }
        int n = a.length+b.length;
        int c1=0;
        int c2=0;
        int c3=0;
        for (int i = 0; i<n; i++){
            if (c1>= a.length){
                arr[c3] = b[c2];
                c2++;
                c3++;
            } else if (c2>= b.length){
                arr[c3] = a[c1];
                c1++;
                c3++;
            } else {
                if (a[c1]<=b[c2]){
                    arr[c3] = a[c1];
                    c1++;
                    c3++;
                }
                else {
                    arr[c3] = b[c2];
                    c2++;
                    c3++;
                }
            }
        }
    }

    public static void main(String arg[]){
        int[] arr = new int[]{10,15,20,40,8,11,15,22,25};
        merge(arr,0,3,8);
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
