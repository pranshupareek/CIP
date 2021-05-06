package hackwithinfymock;

import java.util.*;

public class ques2 {

    static boolean getRes(int arr[]){
        if (arr[0]+arr[1]+arr[2]!=arr[3]+arr[4]){
            return false;
        }

        int min1 = arr[0];
        for (int i = 1; i<3;i++){
            min1 = Math.min(min1, arr[i]);
        }
        int min2 = Math.min(arr[4],arr[3]);

        if (min2<min1){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0){
            int arr[] = new int[5];
            for (int i = 0; i<5; i++){
                arr[i] = s.nextInt();
            }

            if (getRes(arr)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        s.close();
    }
}
