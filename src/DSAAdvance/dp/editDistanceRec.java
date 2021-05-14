package DSAAdvance.dp;

public class editDistanceRec {
    static int editDist(String s1, String s2, int n, int m){
        if (n==0){
            return m;
        }

        if (m==0){
            return n;
        }

        if (s1.charAt(n-1)==s2.charAt(m-1)){
            return editDist(s1, s2, n-1, m-1);
        }
        // add
        int add, replace, delete;
        add = editDist(s1, s2, n, m-1);
        replace = editDist(s1, s2, n-1, m-1);
        delete = editDist(s1, s2, n-1, m);
        return 1+Math.min(add, Math.min(replace, delete));
    }
    static int getED(String s1, String s2){
        return editDist(s1, s2, s1.length(), s2.length());
    }

    public static void main(String[] args) {
        System.out.println(getED("CAT", "CUT"));
        System.out.println(getED("GEEK", "GEEKS"));
        System.out.println(getED("SATURDAY", "SUNDAY"));
        System.out.println(getED("PRANSHU", "PAREEK"));
    }
}
