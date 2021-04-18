package CodeJam.io.q2;
import java.util.*;

public class Solution {

    static ArrayList<Character> getAphabet(){
        char ch = 'A';
        ArrayList<Character> al = new ArrayList<>();
        for( ; ch <= 'Z' ; ch++ )
            al.add(ch);

        return al;

    }
    static void getResult(int req[], int n){
        ArrayList<Character> al = getAphabet();
        StringBuffer str = new StringBuffer();
        str.append('A');
        for (int i = 0; i<n; i+=2){
            int left = req[i];
            int right;
            if (i<n-1)
            right = req[i+1];
            else 
            right = 0;
            for (int j = 1; j<left;j++){
                str.append(al.get(j));
            }
            if (left>right){
                str.append(al.get(left));
            }
            else {
                str.append(al.get(right));
            }
            for (int j = right-1; j>=0; j--){
                str.append(al.get(j));
            }
        }

        System.out.println(str);
        

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for (int testCase = 1; testCase<=t; testCase++){
            int n = s.nextInt();
            int req[] = new int[n];
            for (int i = 0; i<n; i++){
                req[i] = s.nextInt();
            }
            System.out.print("Case #"+testCase+": ");
            getResult(req,n);
        }
    }
}
