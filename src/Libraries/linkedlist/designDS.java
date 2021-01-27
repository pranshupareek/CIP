package Libraries.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class designDS {
    List<Integer> nds = new LinkedList<Integer>();
    void add(int x){
        nds.add(x);
    }
    void removeAndPrint(int x){
        Iterator<Integer> it = nds.iterator();
        while (it.hasNext()){
            int cur = it.next();
            if (cur == x){
                it.remove();
            }
            else {
                System.out.print(cur+" ");
            }
        }
        System.out.println();
    }
}

class main{
    public static void main(String arg[]){
        designDS x = new designDS();
        x.add(10);
        x.add(20);
        x.add(10);
        x.add(30);
        x.removeAndPrint(10);
    }
}
