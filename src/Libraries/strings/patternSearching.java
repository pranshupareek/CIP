package Libraries.strings;

public class patternSearching {
    static void printIndex(String txt, String pat){
        int index = txt.indexOf(pat);
        while (index>=0){
            System.out.print(index+" ");
            index = txt.indexOf(pat, index+1);
        }
    }

    public static void main (String arg[]){
        printIndex("abcd abcd","ab");
    }
}
