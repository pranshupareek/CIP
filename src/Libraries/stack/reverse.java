package Libraries.stack;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class reverse {
    static List<Integer> reverseList(List<Integer> list){
        Iterator<Integer> it = list.iterator();
        ArrayDeque<Integer> s = new ArrayDeque<>();
        while (it.hasNext()){
            s.push(it.next());
        }
        list.clear();
        int size = s.size();
        for (int i = 0; i<size; i++){
            list.add(s.pop());
        }
        return list;
    }

    public static void main(String arg[]){
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list = reverseList(list);
        for (Integer x: list){
            System.out.print(x+ " ");
        }
        System.out.println();
    }
}
