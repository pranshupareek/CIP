package DSAAdvance.sorting;

public class unionOfSortedArrays {
    static void printUnion(int a[], int b[]){
        int n = a.length;
        int m = b.length;
        int i = 0;
        int j = 0;
        while (i<n && j<m){
            if (i>0 && a[i] == a[i-1]){
                i++;
            }
            else if (j>0 && b[j] == b[j-1]){
                j++;
            }
            else if (a[i]==b[j]){
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
            else if (a[i]>b[j]){
                System.out.print(b[j]+" ");
                j++;
            }
            else {
                System.out.print(a[i]+" ");
                i++;
            }
        }
        while (i<n){
            System.out.print(a[i]+" ");
            i++;
        }
        while (j<m){
            System.out.print(b[j]+" ");
            j++;
        }
        System.out.println();
    }
    public static void main(String arg[]){
        int a[] = {3,5,8};
        int b[] = {2,8,9,10,15};
        printUnion(a,b);
    }
}
