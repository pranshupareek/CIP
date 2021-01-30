package Libraries.treemap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class DSForItemPrice {
    TreeMap<Integer, String> tm;
    DSForItemPrice(){
        tm = new TreeMap<>();
    }
    void add(int price, String item){
        tm.put(price,item);
    }
    String find(int price){
        if (tm.get(price)==null){
            return "";
        }
        return tm.get(price);
    }
    void printSorted(){
        for (Map.Entry<Integer, String> x : tm.entrySet()){
            System.out.println(x.getValue()+" "+x.getKey());
        }
    }
    void printGreaterSorted(int price){
        SortedMap<Integer, String> sm = tm.tailMap(price);
        for (Map.Entry<Integer, String> x : sm.entrySet()){
            System.out.println(x.getValue() + " " + x.getKey());
        }
    }
    void printSmallerSorted(int price){
        SortedMap<Integer, String> sm = tm.headMap(price);
        for (Map.Entry<Integer, String> x : sm.entrySet()){
            System.out.println(x.getValue() + " " + x.getKey());
        }
    }
}

class main{
    public static void main(String args[])
    {
        DSForItemPrice ds = new DSForItemPrice();

        ds.add(5,"xyz");
        ds.add(10,"abc");
        ds.add(50,"pqr");

        System.out.println("printGreaterSorted:");
        ds.printGreaterSorted(7);

        System.out.println("printSmallerSorted:");
        ds.printSmallerSorted(50);

        System.out.println("printSorted:");
        ds.printSorted();
    }
}
