import java.util.Scanner;

public class gph {

    public static int deleteElementInArray(int n, int[] arr, int ele){
        boolean elementFound = false;
        int elementFoundAt = -1;
        for (int i=0; i<=n; i++){
            if (ele == arr[i]){
                elementFound = true;
                elementFoundAt = i;
                break;
            }
        }
        if (elementFound){
            for (int i = elementFoundAt; i < n-1; i++){
                arr[i]=arr[i+1];
            }
            n=n-1;
        }
        return n;
    }

    public static int indexOfLargestElement(int[] arr, int n){
        int large=0;
        for (int i=0; i<n; i++){
            if (arr[large]<arr[i]){
                    large=i;
            }
        }
        return large;
    }

    public static int indexOfSecondLargestElement(int[] arr, int n){
        int largest=0;
        int secondLargest=-1;
        for (int i=0; i<n; i++){
            if (arr[largest]<arr[i]){
                secondLargest=largest;
                largest=i;
            }
            else if (secondLargest!=-1 && arr[secondLargest]<arr[i] && arr[largest]!=arr[i]){
                secondLargest=i;
            }
            else if (secondLargest==-1 && arr[largest]!=arr[i]){
                secondLargest=i;
            }
        }
        return secondLargest;
    }

    public static void moveZerosToEnd(int[] arr){
        int n = arr.length;
        int zero = -1;
        for (int i=0; i<n; i++){
            if (arr[i]==0 && zero==-1){
                zero=i;
            }
            else if (arr[i]!=0 && zero!=-1){
                arr[zero]=arr[i];
                arr[i]=0;
                zero++;
            }
        }
    }

    public static void reverseArray(int[] arr){
        int n = arr.length;
        int temp;
        for (int i = 0; i<n/2; i++){
            temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }

    public static void leftRotateArray(int[] arr){
        int n = arr.length;
        int temp=arr[0];
        for (int i = 0; i<n-1; i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
    }

    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

//        Left rotate an array
        int[] arr = new int[n];
        for (int i = 0; i<n ; i++){
            arr[i] = s.nextInt();
        }
        leftRotateArray(arr);
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");



////        Reverse an array
//        int[] arr = new int[n];
//        for (int i = 0; i<n ; i++){
//            arr[i] = s.nextInt();
//        }
//        reverseArray(arr);
//        for (int i=0; i<n; i++)
//            System.out.print(arr[i]+" ");



////      Q. Move all zeros to end
//        int[] arr = new int[n];
//        for (int i = 0; i<n ; i++){
//            arr[i] = s.nextInt();
//        }
//        moveZerosToEnd(arr);
//        for (int i=0; i<n; i++)
//            System.out.print(arr[i]+" ");




////      Q. Index of the Second largest element
//        int[] arr = new int[n];
//        for (int i = 0; i<n ; i++){
//            arr[i] = s.nextInt();
//        }
//        System.out.println(indexOfSecondLargestElement(arr,n));


////        Q. Index of the largest element
//        int[] arr = new int[n];
//        for (int i=0; i<n; i++){
//            arr[i] = s.nextInt();
//        }
//        int index = indexOfLargestElement(arr,n);
//        System.out.println(index);


////      Q.  Deletion in Array
//        int ele = s.nextInt();
//        int[] arr = new int[]{3, 8, 12, 5, 6};
//        n=deleteElementInArray(n, arr, ele);
//
//        for (int i=0; i<n; i++){
//            System.out.println(arr[i]);
//        }




        



//        int ans = 0;
////        Sum of first N natural number = O(N)
//        for ( int i = 1; i <= n; i++) ans += i;

//        Sum of first N natural number O(1)
//        ans = n*(n+1)/2;
//
//
//        System.out.println(ans);
    }
}
