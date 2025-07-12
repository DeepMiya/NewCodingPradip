package javaConcepts;
class child extends FinalKeyword
{
    //void m1()///cant override final method
    {
        System.out.println("child class method");
    }
}

public class FinalKeyword {
    final int x=10;//variable
    final void m1()
    {
        System.out.println(" test parent");
    }

    public static void main(String[] args)
    {
        FinalKeyword fk= new FinalKeyword();
       // fk.x=200; //if x is not final then we can change variable at any time
         System.out.println(fk.x);
    }
}
