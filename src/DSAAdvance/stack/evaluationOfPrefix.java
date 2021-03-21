package DSAAdvance.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class evaluationOfPrefix {
    static int evaluate(String exp){
        int n = exp.length();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = n-1;i>=0;i--){
            char c = exp.charAt(i);
            if (c == ' ')
                continue;
            else if(Character.isDigit(c)){
                String num = "";
                for (int j = 0; Character.isDigit(c); j++){
                    num = c+num;
                    i--;
                    c = exp.charAt(i);
                }
                i++;
                stack.push(Integer.parseInt(num));
            }
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch(c){
                    case '+': 
                    stack.push(val1+val2);
                    break;
                    case '-': 
                    stack.push(val1-val2);
                    break;
                    case '*': 
                    stack.push(val1*val2);
                    break;
                    case '/': 
                    stack.push(val1-val2);
                    break;
                    case '^':
                    stack.push((int)Math.pow(val1, val2));
                    break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "+ - 10 2 3";
        System.out.println(evaluate(exp));
    }
}
