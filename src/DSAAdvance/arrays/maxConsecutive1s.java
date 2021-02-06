package DSAAdvance.arrays;

public class maxConsecutive1s {
    static void printMaxOnes(int arr[]){
        int n = arr.length;
        int res = 0;
        int temp = 0;

        for (int i = 0; i<n; i++){
            if (arr[i] == 1){
                temp++;
            }
            else {
                if (temp>res){
                    res = temp;
                }
                temp = 0;
            }
        }
        if (temp>res){
            res = temp;
        }
        System.out.println(res);
    }
    public static void main(String arg[]){
        int arr[] = {1,1,1,1,0,0,0,1,1,1,1,1,0,0,1};
        printMaxOnes(arr);
    }
}
