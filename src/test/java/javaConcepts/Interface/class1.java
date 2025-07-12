package javaConcepts.Interface;

public class class1 extends class2 implements Inter1,Inter2 {///multiple interfaces implements in one class
/// ///Hybrid interface c2 as parent class first extends in C1 class then implements Interfaces Inter1 &2
    @Override
   public void m1()
    {
        System.out.println("Abstact method from interface1");
    }

    @Override
    public void m2()
    {
        System.out.println("Abstact method from interface2");
    }
    public static void main(String[] args){
        class1 c1=new class1();
        c1.m1();
        c1.m2();
        c1.c1();///Hybrid interface c2 as parent class first extends in C1 class then implements Interfaces Inter1 &2

    }
}
