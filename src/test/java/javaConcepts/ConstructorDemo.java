package javaConcepts;

import org.checkerframework.checker.units.qual.C;

public class ConstructorDemo {
    int a;
    int b;

    ConstructorDemo()//Default contructor
    {
         a=100;
         b=200;
    }
    ConstructorDemo(int x,int y)//parameterized constructor
    {
        a=x;
        b=y;
    }
    void sum()//method
    {
        System.out.println(a+b);
    }
    public static void main(String[] args)
    {
        /*ConstructorDemo cd=new ConstructorDemo();  //invoked default constructor
        cd.sum();
        */
         ConstructorDemo cd=new ConstructorDemo(10,20); //called parameterized construtor
         cd.sum();

    }





}
