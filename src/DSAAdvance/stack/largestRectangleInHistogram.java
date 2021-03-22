// package DSAAdvance.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class largestRectangleInHistogram {
    static int getMaxArea(int histogram[]){
        int n = histogram.length;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        int res = 0;
        int cur = res;
        for (int i = 1; i<n; i++){
            int pop;
            while(!stack.isEmpty()&&histogram[stack.peek()]>histogram[i]){
                pop = stack.pop();
                cur = Math.min(histogram[pop], histogram[i-1])*(i-pop);
                res = Math.max(res,cur);
            }
            stack.push(i);
        }
        int i = n-1;
        while(!stack.isEmpty()){
            int pop = stack.pop();
            cur = Math.min(histogram[pop], histogram[i])*(i-pop+1);
            res = Math.max(res,cur);
        }
        return res;
    }

    public static void main(String[] args) {
        int histogram[] = {6,2,5,4,1,5,6};
        System.out.println(getMaxArea(histogram));
    }
}
