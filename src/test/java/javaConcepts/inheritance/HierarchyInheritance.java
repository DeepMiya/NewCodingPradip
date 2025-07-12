package javaConcepts.inheritance;
class Parent
{
    void display(int a)
    {
        System.out.println(a);
    }
}
class Class1 extends Parent
{
    void show(int b)
    {
        System.out.println(b);
    }
}
class Class2 extends Parent
{ void view(int c)
{
    System.out.println(c);
}

}
public class HierarchyInheritance {
    public static void main(String[] args)
    {
        Class1 c1=new Class1();
        c1.display(10);
        c1.show(20);

        Class2 c2=new Class2();
        c2.display(10);
        c2.view(30);

    }
}
