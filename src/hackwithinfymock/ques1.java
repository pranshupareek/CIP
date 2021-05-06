package hackwithinfymock;

import java.util.*;

public class ques1 {

    static void getSol(int arr[], int n){
        int pvs = arr[0];
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(arr[0], 1);

        for(int i = 1; i<n; i++){
            if (!hm.containsKey(arr[i])){
                hm.put(arr[i], 1);
                pvs = arr[i];
            }
            else{
                if (pvs==arr[i]){
                    pvs=-1;
                }
                else{
                    pvs = arr[i];
                    hm.put(arr[i], hm.get(arr[i])+1);
                }
            }
        }
        int res[] = new int[2];
        for (Map.Entry<Integer, Integer> e: hm.entrySet()){
            if (res[1]<e.getValue()||(res[1]==e.getValue()&&res[0]>e.getKey())){
                res[0] = e.getKey();
                res[1] = e.getValue();
            }
        }
        System.out.println(res[0]);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t-->0){
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i<n; i++){
                arr[i] = s.nextInt();
            }

            getSol(arr, n);

        }
        s.close();
    }
}
