package javaConcepts.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String []args)
    {
        //Declaration
        HashMap hm=new HashMap();
        //Map hm=new HashMap();
        //HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"John");
        hm.put(2,"Deepak");
        hm.put(1,"Siddha");//last updated taken
        hm.put(3,100);
        hm.put(4,'A');
        System.out.print(hm);

/////Insert
        hm.put(7,9839871);

        //size
        hm.size();

        //remove pair
        hm.remove(7);
        //Access value of the key
        hm.get(1);
        //get all keys
        hm.keySet();
        //get all vaule
        hm.values();
        //get key and value
        hm.keySet();

       // print
        /*
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
    System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
}
         */

        for (Object x:hm.keySet())
        {
            System.out.println(hm.get(x));
        }







    }
}
