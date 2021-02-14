package DSAAdvance.sorting;

public class intersectionOfSortedArray {
    static void printIntersection(int arr1[],int arr2[]){
        int i = 0, j = 0;
        while (i< arr1.length && j < arr2.length){
            if (arr1[i]==arr2[j]){
                System.out.print(arr1[i]+" ");
                while (i< arr1.length && arr1[i]==arr2[j]){
                    i++;
                }
            }
            else if (arr1[i]<arr2[j]){
                i++;
            }
            else {
                j++;
            }
        }
    }
    public static void main(String aeg[]){
        int a[] = {1,1,3,3,3};
        int b[] = {1,1,1,1,3,5,7};
        printIntersection(a,b);
    }
}
