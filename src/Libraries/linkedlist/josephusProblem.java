package Libraries.linkedlist;
import java.util.*;

public class josephusProblem {
    static int jp(int n, int gap){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i<n; i++){
            list.add(i);
        }
        Iterator<Integer> it = list.iterator();
        while (list.size()>1){
            int count = 0;
            while (count<gap){
                while (it.hasNext()&&count<gap){
                    it.next();
                    count++;
                }
                if (count<gap){
                    it = list.iterator();
                    it.next();
                    count++;
                }
            }
            it.remove();
        }
        return list.getFirst();
    }
    public static void main(String arg[]){
        System.out.println(jp(7,3));
    }
}
