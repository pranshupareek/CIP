class boundaryElements {
    static void printBoundaryElements(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;
        int i = 0,j = 0;     
        if (r==1){
            for (; i<c; i++){
                System.out.print(arr[0][i]+" ");
            }
            System.out.println();
            return;
        }
        if (c==1){
            for (; i<r; i++){
                System.out.print(arr[i][0]+" ");
            }
            System.out.println();
            return;
        }
        do{
            System.out.print(arr[i][j]+" ");
            if (i==0&&j!=c-1){
                j++;
            }
            else if (j==c-1&&i!=r-1){
                i++;
            }
            else if (i==r-1&&j!=0){
                j--;
            }
            else {
                i--;
            }
        } while(i!=0||j!=0);
    }

    public static void main(String argsStrings[]) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        printBoundaryElements(arr);
    }
}
