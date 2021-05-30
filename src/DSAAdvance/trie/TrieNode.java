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

    static TrieNode remove(TrieNode root, String key, int i){
        if (root==null){
            return null;
        }
        if (i==key.length()){
            if (root.isEnd){
                root.isEnd = false;
            }
            if (isEmpty(root)){
                root = null;
            }
            return root;
        }

        int index = key.charAt(i) - 'a';
        root.child[index] = remove(root.child[index], key, i+1);

        if (isEmpty(root)&&!root.isEnd){
            root = null;
        }
        return root;
    }

    static boolean isEmpty(TrieNode root){
        for (int i = 0; i<26; i++){
            if (root.child[i]!=null){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        TrieNode Trie = new TrieNode();
        String dict[] = {"bad","bat","geek","geeks","cat","cut","zoo"};
        for (String str : dict){
            insert(Trie, str);
        }
        System.out.println(search(Trie, "str"));
        System.out.println(search(Trie, "bad"));
        remove(Trie, "bad", 0);
        System.out.println(search(Trie, "bad"));
        System.out.println(search(Trie, "bat"));
    }
}
