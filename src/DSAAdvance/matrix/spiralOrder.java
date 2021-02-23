import jdk.javadoc.internal.tool.Main;

public class spiralOrder {
    static void printSpiralOrder(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;
        int top = 0, right = r-1, bottom = c-1, left = 0;
        while (top<=bottom && left<=right){
            for (int i = left; i<=right;i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for (int i = top; i<=bottom; i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;
            for (int i = right; i>=left; i--){
                System.out.print(arr[bottom][i]+" ");
            }
            bottom--;
            for (int i = bottom; i>=top; i--) {
                System.out.print(arr[i][left]+" ");
            }
            left++;
        }
    }
    public static void main (String arg[]) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiralOrder(arr);
    }
}
