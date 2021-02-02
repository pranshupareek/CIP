package DSAAdvance.bitmagic;

public class powerSet {
    static void printPowerSet(String arr){
        int n = (1<<arr.length());
        for (int i = 0; i<n; i++){
            int temp = i;
            int pos = 0;
            while (temp>0){
                if ((temp & 1) == 1) {
                    System.out.print(arr.charAt(pos));
                }
                temp = temp>>1;
                pos++;
            }
            System.out.println();
        }
    }

    public static void main(String arg[]){
        String arr = "abc";
        printPowerSet(arr);
    }
}
