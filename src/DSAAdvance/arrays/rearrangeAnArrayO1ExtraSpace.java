package DSAAdvance.arrays;

public class rearrangeAnArrayO1ExtraSpace {
    static void arrange(long arr[], int n)
    {
        for (int i = 0; i<n; i++){
            arr[i] += (n*(arr[(int)arr[i]]));
        }
        for (int i = 0; i<n; i++){
            arr[i]/=n;
        }
    }
}
