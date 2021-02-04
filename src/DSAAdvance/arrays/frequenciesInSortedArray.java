package DSAAdvance.arrays;

public class frequenciesInSortedArray {
    static void printFreq(int arr[]){
        int cur = arr[0];
        int n = arr.length;
        int freq = 0;
        for (int i = 0; i < n; i++){
            if (cur!=arr[i]){
                System.out.println(cur+" "+freq);
                cur = arr[i];
                freq = 1;
            }
            else {
                freq++;
            }
        }
        System.out.println(cur+" "+freq);
    }

    public static void main(String arg[]){
        int arr[] = {10,10,20,30};
        printFreq(arr);
    }
}
