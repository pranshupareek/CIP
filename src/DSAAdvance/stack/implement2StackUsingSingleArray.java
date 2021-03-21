package DSAAdvance.stack;

class stack{
    private int size;
    private int arr[];
    private int top1;
    private int top2;
    stack(int n){
        size = n;
        arr = new int[size];
        top1 = 0;
        top2 = n-1;
    }
    void push1(int ele){
        if (top1>top2){
            System.out.println("Stack overflow");
            return;
        }
        arr[top1++] = ele;
    }
    void push2(int ele){
        if (top1>top2){
            System.out.println("Stack overflow");
            return;
        }
        arr[top2--] = ele;
    }
    int pop1(){
        if (top1==0){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[--top1];
    }
    int pop2(){
        if (top2==size-1){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[++top2];
    }
    int peek1(){
        if (top1==0){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top1-1];
    }
    int peek2(){
        if (top2==size-1){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top2+1];
    }
}

public class implement2StackUsingSingleArray {
    public static void main(String[] args) {
        stack s = new stack(3);
        s.push1(19);
        System.out.println(s.peek1());
        s.push1(15);
        System.out.println(s.peek2());
        s.push2(5);
        s.push1(14);
        System.out.println(s.pop1());
        s.push2(2);
        System.out.println(s.peek2());
    }
}
