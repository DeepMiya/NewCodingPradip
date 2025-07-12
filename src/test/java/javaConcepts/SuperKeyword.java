package javaConcepts;
class Parent
{
    String colour="pink";
}
class Child extends Parent{
    String colour="Red";

      void disply()
      {
          System.out.println(colour);//child colour will print
         // System.out.println(super.colour); //access parent class variable using child class object via super keyword
      }
}

public class SuperKeyword {
    public static void main(String[] args)
    {
        Child c=new Child();
        c.disply();

    }

}
