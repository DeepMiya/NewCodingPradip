package javaConcepts.overriding;
class ABC
{
    void m1(int a)
    {
        System.out.println(a);
    }
    void m2(int b)
    {
        System.out.println(b);
    }
}
class XYZ extends ABC
{
    void m1(int a)//overriding
    {
        System.out.println(a*a); //declaration same , Implementation different
    }
    void m2(int a,int b)//Overloading
    {
        System.out.println(a+b);
    }

}

public class OverloadingVsOverriding {
    public static void main(String[] args)

    {
        XYZ d=new XYZ();
        d.m1(5);
        d.m2(20);
        d.m2(100,200);

    }
}
