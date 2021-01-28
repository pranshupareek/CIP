package Libraries.stack;


import java.util.ArrayDeque;
import java.util.Deque;

public class balancedParentheses {
    static boolean checkBalanced(String str){
        Deque<Character> s = new ArrayDeque<>();
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='('){
                s.push(str.charAt(i));
            }
            else {
                if (s.isEmpty()==true){
                    return false;
                }
                else if (str.charAt(i)=='}' && s.peek() == '{'){
                    s.pop();
                }
                else if(str.charAt(i)==']' && s.peek() == '['){
                    s.pop();
                }
                else if(str.charAt(i)==')' && s.peek() == '('){
                    s.pop();
                }
                else {
                    return false;
                }
            }
        }
        return (s.isEmpty()==true);
    }
    public static void main(String arg[]){
        String str = "{{[}]}";
        if (checkBalanced(str)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
