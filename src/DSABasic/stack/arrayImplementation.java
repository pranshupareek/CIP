package DSABasic.stack;

import java.util.ArrayList;
import java.util.Arrays;

class MyStack{
    int[] arr;
    int size;
    int max;
     MyStack(int len){
        arr = new int[len];
        max = len;
    }
    boolean push(int ele){
         if (size<max){
             arr[size]=ele;
             size++;
             return true;
         } else {
             return false;
         }
    }

    int peek(){
         if (size == 0){
             return -1;
         }
         return arr[size-1];
    }
    int pop(){
         if (size == 0){
             return -1;
         }
         return arr[--size];
    }
    boolean isEmpty(){
         return size==0;
    }
}

class  myStack{
    ArrayList<Integer> al = new ArrayList<>();

    void push(int x){
        al.add(x);
    }
    int pop(){
        if (al.size()==0){
            return -1;
        }
        int res = al.get(al.size()-1);
        al.remove(al.size()-1);
        return res;
    }
    int peek(){
        if (al.size()==0){
            return -1;
        }
        return al.get(al.size()-1);
    }
    boolean isEmpty(){
        return al.isEmpty();
    }
    int size(){
        return al.size();
    }
}

public class arrayImplementation {
    public static void main(String arg[]){
        myStack s = new myStack();
        s.push(5);
        s.push(15);
        s.push(25);
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.push(35);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }


}
