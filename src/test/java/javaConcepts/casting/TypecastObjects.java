package javaConcepts.casting;

import java.util.Scanner;

class Parent
{
    int age=97;
    void m1()
    {
        System.out.println("I am parent");
    }
}
class Child extends Parent
{
    int cage=20;
    void m2()
    {
        System.out.println("I am child");
    }
}

public class TypecastObjects {
    public static void main(String[] args)
    {
        /*
        //Sc 01
        Child c=new Child();
       System.out.println( c.age); //parent
       c.m1();//parent
        System.out.println(c.cage);//child
        c.m2();//child

        //Sc 02 -Upcasting
        Parent p=new Child(); //Parent variable & Child Object
        System.out.println( p.age); //parent
        p.m1();//parent
        //System.out.println(p.cage);//child not accessible
        //p.m2();//child not accesible
*/
        //Sc03  -Downcasting
        Child cd =(Child)new Parent();
        System.out.println( cd.age); //parent
        cd.m1();//parent
        //System.out.println(cd.cage);//child ...During runtime will get ClassCasException
        //cd.m2();//child ....During runtime will get ClassCasException


    }
}
