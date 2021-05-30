package DSAAdvance.trie;

class Trie{
    Trie children[] = new Trie[2];
    boolean isEnd;
    void insert(boolean[] mat){
        Trie cur = this;
        int n = mat.length;
        for (int i = 0; i<n; i++){
            int index = (mat[i])?1:0;
            if (cur.children[index]==null)
                cur.children[index] = new Trie();
            cur = cur.children[index];
        }
        cur.isEnd = true;
    }
    boolean search(boolean[] mat){
        Trie cur = this;
        int n = mat.length;
        for (int i = 0; i<n; i++){
            int index = (mat[i])?1:0;
            if (cur.children[index]==null){
                return false;
            }
            cur = cur.children[index];
        }
        return cur.isEnd;
    }
}



public class countDistinctMat {
    
    static int countDistinct(boolean mat[][]){
        Trie t = new Trie();
        int n = mat.length;
        int res = 0;
        for (int i = 0; i<n; i++){
            if (!t.search(mat[i])){
                t.insert(mat[i]);
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        boolean mat1[][] = {
            {true,false,false},
            {true,true,true},
            {true,false,false},
            {true,true,true}
        };
        boolean mat2[][] = {
            {true,true,false,false},
            {true,true,false,false},
            {true,true,false,false},
            {true,true,false,false}
        };

        System.out.println(countDistinct(mat1));
        System.out.println(countDistinct(mat2));
    }
    
}
