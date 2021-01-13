package DSABasic.stack;

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

public class arrayImplementation {
    public static void main(String arg[]){
        MyStack s = new MyStack(10);
        s.push(5);
        s.push(15);
        s.push(25);
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.push(35);
        System.out.println(s.size);
        System.out.println(s.isEmpty());
    }


}
