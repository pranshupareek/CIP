package DSAAdvance.recursion;

public class printingAllPermutations {
    static void printPermutation(String s){
        printPermutation(s, 0);
    }
    static String swap(String str, int i, int j)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }

    static void printPermutation(String s, int i){
        if (i==s.length()-1){
            System.out.println(s+" ");
            return;
        }
        for (int j = i; j<s.length(); j++){
            s = swap(s,i,j);
            printPermutation(s,i+1);
            s = swap(s,i,j);
        }
    }

    public static void main(String arg[]){
        String s = "abc";
        printPermutation(s);
    }
}
