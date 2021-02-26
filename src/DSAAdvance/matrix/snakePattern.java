class snakePattern{
    static void printSnakePattern(int arr[][]){
        int u = arr.length;
        int v = arr[0].length;
        for (int i = 0; i<u; i++){
            for (int j = 0; j < v; j++){
                int tj = ((i&1)==0)?j:v-j-1;
                System.out.print(arr[i][tj]+" ");
            }
        }
    }
    public static void main(String arg[]){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        printSnakePattern(arr);
    }
}