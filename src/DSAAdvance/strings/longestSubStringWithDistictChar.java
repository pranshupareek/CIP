import java.util.*;

public class longestSubStringWithDistictChar {
    static int getLength(String str){
        int n = str.length();
        Set<Character> hs = new HashSet<>();

        int res = 0;
        int cur = 0;
        for (int i = 0; i<n; i++){
            if (hs.contains(str.charAt(i))){
                cur--;
                hs.remove(str.charAt(i-cur));
                i--;
            }
            else {
                hs.add(str.charAt(i));
                cur++;
            }
            res = Math.max(res, cur);
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "abaacdbab";
        System.out.println(getLength(str));
    }
}
