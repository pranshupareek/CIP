package DSAAdvance.greedy;

import java.util.Arrays;
import java.util.Comparator;

class knapsack{
    int weight;
    int values;
    knapsack(int x, int y){
        weight = x;
        values = y;
    }
}

public class fractionalKnapsack {
    static int getKnapsack(knapsack[] k, int cap){
        Arrays.sort(k,new Comparator<knapsack>(){
            public int compare(knapsack k1, knapsack k2){
                return k2.values*k1.weight- k1.values*k2.weight;
            }
        });

        int n = k.length;
        int res = 0;
        for (int i = 0; i<n; i++){
            if (k[i].weight>=cap){
                res+=cap*k[i].values/k[i].weight;
                break;
            }
            else {
                res+= k[i].values;
                cap-=k[i].weight;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        knapsack k[] = {
            new knapsack(50, 600),
            new knapsack(20, 500),
            new knapsack(30, 400)
        };
        System.out.println(getKnapsack(k, 70));
    }
}
