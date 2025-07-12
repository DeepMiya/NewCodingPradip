package javaConcepts.collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String [] args)
    {
        //Declaration
        //HashSet hs=new HashSet();
        Set hs=new HashSet();
        //Set<String> hs=new HashSet<String>();

        //Add elements
        hs.add(10);
        hs.add("Shiv");
        hs.add(10);
        hs.add("Shambhu");
        hs.add(null);
        hs.add(null);

        //print
        System.out.println(hs);

        //remove elem
        hs.remove(null);//not index, mentioned value as it doen't support indexing
        System.out.println(hs);

        //Insert --not possible
        //Access specific element --not possible

        //convert HasSet to ArrayList
        ArrayList al =new ArrayList(hs);
        System.out.println(al);
        System.out.println(al.get(2));

        //read all elements using for each
        for(Object ob:hs)
        {
            System.out.println(ob);
        }
        //using Iterator
        //Iterator<Object> it=hs.Iterator();

        //clearing all element
        hs.clear();
        System.out.println(hs);





    }
}
