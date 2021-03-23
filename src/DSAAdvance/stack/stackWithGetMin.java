package DSAAdvance.stack;

import java.util.ArrayDeque;
import java.util.Deque;

class Stack{
    int arr[];
    int size;
    int top;
    Deque<Integer> minStack;
    Stack(int n){
        arr = new int[n];
        size = n;
        minStack = new ArrayDeque<>();
        top = -1;
    }
    void push(int ele){
        if (top>=size-1){
            return;
        }
        arr[++top] = ele;
        if (minStack.isEmpty()||minStack.peek()>=ele){
            minStack.push(ele);
        }
    }
    int pop(){
        if (top==-1){
            return -1;
        }
        if (minStack.peek()==arr[top]){
            minStack.pop();
        }
        return arr[top--];
    }
    int getMin(){
        if (minStack.isEmpty()){
            return -1;
        }
        return minStack.peek();
    }
}

public class stackWithGetMin {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(20);
        s.push(10);
        System.out.println(s.getMin());
        s.push(5);
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.getMin());

        Stack s2 = new Stack(5);
        s2.push(5);
        s2.push(4);
        s2.push(3);
        System.out.println(s2.getMin());
        s2.pop();
        System.out.println(s2.getMin());
        s2.push(2);
        System.out.println(s2.getMin());
    }
}
