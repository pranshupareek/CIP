package DSABasic.sorting;

public class mergeTwoSortedArray {

    public static int[] merge(int a[], int b[]){
        int n = a.length+b.length;
        int[] arr = new int[n];
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
        return arr;
    }

    public static void main(String arg[]){
        int[] a= new int[]{1,1,2};
        int[] b= new int[]{3};
        int[] arr = merge(a,b);
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
