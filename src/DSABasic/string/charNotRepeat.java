package DSABasic.string;

public class charNotRepeat {
    public static int leftCharNR(String str){
        int res = Integer.MAX_VALUE;
        int[] fi = new int[256];
        for (int i = 0; i< 256; i++){
            fi[i]=-1;
        }
        for (int i=0; i<str.length(); i++){
            if (fi[str.charAt(i)]==-1){
                fi[str.charAt(i)] = i;
            }
            else {
                fi[str.charAt(i)] = -2;
            }
        }
        for (int i=0; i<256; i++){
            if (fi[i] >= 0)
                res = Math.min(res, fi[i]);
        }
        return (res == Integer.MAX_VALUE)?-1:res;
    }
    public static void main(String arg[]){
        String str = "pranshu pareek";
        System.out.println(str);
        System.out.println(leftCharNR(str));
    }
}