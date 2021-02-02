package DSAAdvance.bitmagic;

public class oneOddOccurring {
    static int oddOccurring(int arr[]){
        int res = 0;
        for (int i = 0; i< arr.length; i++){
            res= res^arr[i];
        }
        return res;
    }

    public static void main(String arg[]){
        int arr[] = {4,3,4,4,4,5,5};
        System.out.println(oddOccurring(arr));
    }
}
