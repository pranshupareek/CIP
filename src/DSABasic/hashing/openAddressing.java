package DSABasic.hashing;

public class openAddressing {
    class myHash {
        int[] arr;
        int cap, size ;
        void myHash(int c){
            cap = c;
            size = 0;
            for (int i=0; i<cap; i++){
                arr[i]=-1;
            }
        }
        int hash(int key){
            return key%cap;
        }
        boolean search(int val){
            int h = hash(val);
            int i=h;
            while (arr[i] != -1){
                if (arr[i] == val)
                    return true;
                i = (i+1)%cap;
                if (i==h)
                    return false;
            }
            return false;
        }
        boolean insert(int val){
            int h = hash(val);
            int i=h;
            if (size==cap){
                return false;
            }
            while (true){
                if (arr[i]==val)
                    return false;
                if (arr[i] == -1 || arr[i] == -2){
                    arr[i] = val;
                    size++;
                    return true;
                }
                i = (i+1)%cap;
                if (i==h)
                    return false;
            }
        }
        boolean remove(int val){
            if (size==0){
                return false;
            }
            int h = hash(val);
            int i=h;
            while (arr[i] != -1){
                if (arr[i] == val) {
                    arr[i]=-2;
                    size--;
                    return true;
                }
                i = (i+1)%cap;
                if (i==h)
                    return false;
            }
            return false;
        }
    }
}
