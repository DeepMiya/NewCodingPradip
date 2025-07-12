package javaConcepts.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String[] args) {
        //Declaration
       // HashSet s=new HashSet();
        Set<String> s=new HashSet<>();
        // order of insertion is not maintained
        //Duplicate not allowed in each and every Set
        s.add(null);
        s.add("d");
        s.add(null); //no duplicate
        s.add("d"); //no duplicate
        s.add("jin");

        Set<String> n=new LinkedHashSet<>();
        // order of insertion is maintain
        n.add("a");
        n.add("b");
        n.add("a");
        n.add ("c");
        n.add(null);
        n.add("c");

        Set <String> k=new TreeSet<>();
        //k.add(null); //Does not allow null & order of insertion not maintained
        k.add("A");
        k.add("Z");
        k.add("B");
        k.add("A");
        k.add("S");

        System.out.println("HashSet values-----------");
        for(String si:s) {
            System.out.println(si);
        }
        System.out.println("LinkedHashSet values-----------");
        for (String pi:n) {
            System.out.println(pi);
        }
        System.out.println("Treset values-----------");
        for (String tree:k) {
            System.out.println(tree);
        }

    }

}
