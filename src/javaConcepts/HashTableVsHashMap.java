package javaConcepts;

import java.util.*;

class HashTableVsHashMap {
    public static void main(String[] args){
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(1,"avi");
        ht.put(2, "vivek");
        ht.put(3, "rahul");
        ht.put(4, "mina");
        ht.put(1,"newAvi");
        //ht.put(null,"newAvi"); // hashtable does not allow null : Exception in thread "main" java.lang.NullPointerException

        for (Map.Entry m:ht.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1,"avi");
        hm.put(2, "vivek");
        hm.put(3, "rahul");
        hm.put(4, "mina");
        hm.put(1,"newAvi");
        hm.put(null,"newAvi"); // hashmap allows null
        for(Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }
    }
}
