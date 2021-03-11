public class searchInSortedMatrix {
    static void searchElement(int arr[][] , int ele) {
        int r = arr.length;
        int c = arr[0].length;
        int top = 0;
        int right = r-1;
        while (top<c&&right>=0) {
            if (arr[top][right] == ele) {
                System.out.println(top+" "+right);
                return;
            }
            else if (arr[top][right] > ele) {
                right--;
            }
            else {
                top++;
            }
        }
        System.out.println("Element not found!");
    }
    
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        searchElement(arr, 0);
    }
}
