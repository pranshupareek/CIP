package DSAAdvance.queueanddequeue;

import java.util.*;

class MyDS{
    Deque<Integer> dq = new ArrayDeque<>();

    void insertMin(int e){
        dq.addFirst(e);
    }
    void insertMax(int e){
        dq.addLast(e);
    }
    int getMin(){
        if (dq.isEmpty()){
            return -1;
        }
        return dq.peekFirst();
    }
    int getMax(){
        if (dq.isEmpty()){
            return -1;
        }
        return dq.peekLast();
    }
    int extractMin(){
        if (dq.isEmpty()){
            return -1;
        }
        return dq.getFirst();
    }
    int extractMax(){
        if (dq.isEmpty()){
            return -1;
        }
        return dq.getLast();
    }
    
}

public class DSWithMinMaxOp {
    public static void main (String[] args) {
		MyDS ds = new MyDS();
		
		ds.insertMin(10);
		ds.insertMax(15);
		ds.insertMin(5);
		
		int x= ds.extractMin();
		System.out.println(x);
		
		x= ds.extractMax();
		System.out.println(x);
		
		ds.insertMin(8);
		
		
		
	}
}
