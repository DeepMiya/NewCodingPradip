package javaConcepts.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] aergs)
    {
        //Declaration
       // 3 ways -
        ArrayList al=new ArrayList();//Heterogenious data store
        //List al=new ArrayList();//Heterogenius data store
        //ArrayList<String> alHomo=new ArrayList<String>(); //Homogenius data

        //Add data into arraulist
        al.add("Singh");
        al.add(2);
        al.add(2);
        al.add(null);
        al.add(null); //add will add at the end of the element index
        //Size of arraylist
        System.out.println(al.size()); //in array we are using length to find size
        //Print
        System.out.println("Size of array list"+al);
        //remove element from arraylist
        al.remove(1);
        System.out.println("After remove"+al);
        //Insert Element in array list
        al.add(1,"Pradip");
        System.out.println("After Insert element"+al);//insert will insert at middle of list
        //Modify/replace/change element
        al.set(2,"Java_Automation");
        System.out.println("After replace element"+al);
        //Access specific element
        System.out.println(al.get(2));
        //Reading all elements from arraylist
        //using normal for loop
        for(int i=0;i<=al.size()-1;i++)
        {
            System.out.println(al.get(i));//get value of index i
        }
        //using for each loop
        for(Object a:al)
        {
            System.out.println(a);
        }
        //Using Iterator
        Iterator<Object> it =al.iterator();//not creating object using new keyword
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        //is arraylist empty
        System.out.println(al.isEmpty());
        //remove multiple elements from arraylist at same time
        ArrayList al2=new ArrayList();
        al2.add(null);
        al2.add("Pradip");
        System.out.println(al.removeAll(al2));
        System.out.println("After removed multiple elements:"+al);

        //remove all
        al.clear();
        System.out.println(al.isEmpty());






    }

}
