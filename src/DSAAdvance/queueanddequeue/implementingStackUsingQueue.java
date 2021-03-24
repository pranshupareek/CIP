package DSAAdvance.queueanddequeue;

import java.util.LinkedList;
import java.util.Queue;

class Stack{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    void push(int ele){
        if (q1.isEmpty()){
            q1.add(ele);
            return;
        }
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        q1.add(ele);
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
    }
    int pop(){
        if (q1.isEmpty()){
            return -1;
        }
        return q1.poll();
    }
    int top(){
        if (q1.isEmpty()){
            return -1;
        }
        return q1.peek();
    }
    int size(){
        return q1.size();
    }
}

public class implementingStackUsingQueue {
    public static void main(String[] args) {
        Stack s = new Stack(); 
		s.push(10); 
        s.push(5); 
        s.push(15); 
        s.push(20);

		System.out.println("current size: " + s.size()); 
		System.out.println(s.top()); 
		s.pop(); 
		System.out.println(s.top()); 
		s.pop(); 
		System.out.println(s.top()); 

		System.out.println("current size: " + s.size()); 
    }
}
