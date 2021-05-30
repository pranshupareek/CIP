package DSAAdvance.trie;

public class TrieNode {
    TrieNode[] child;
    boolean isEnd;
    TrieNode(){
        child = new TrieNode[26];
    }
}

class Main{
    static void insert(TrieNode root, String str){
        TrieNode cur = root;
        int n = str.length();
        for (int i = 0; i<n; i++){
            int index = str.charAt(i)-'a';
            if (cur.child[index]==null)
                cur.child[index] = new TrieNode();
            cur = cur.child[index];
        }
        cur.isEnd = true;
    }
    static boolean search(TrieNode root, String str){
        TrieNode cur = root;
        int n = str.length();
        for (int i = 0; i<n; i++){
            int index = str.charAt(i)-'a';
            if (cur.child[index]==null){
                return false;
            }
            cur = cur.child[index];
        }
        return cur.isEnd;
    }
    public static void main(String[] args) {
        TrieNode Trie = new TrieNode();
        String dict[] = {"bad","bat","geek","geeks","cat","cut","zoo"};
        for (String str : dict){
            insert(Trie, str);
        }
        System.out.println(search(Trie, "str"));
        System.out.println(search(Trie, "bad"));
    }
}
