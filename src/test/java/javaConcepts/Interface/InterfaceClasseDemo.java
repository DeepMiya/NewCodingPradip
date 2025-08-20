package javaConcepts.Interface;

 public interface InterfaceClasseDemo {

    int length=10; //By default final and static
    int width=20;//By default final and static

    void circle();//abstract method

    default void square()
    {
        System.out.println("This is square -default method");
    }
    static void rectangle()
    {
        System.out.println("This is rectangle -Static method");
    }

}
 class Implclass implements InterfaceClasseDemo
{
    public void circle()
    {
        System.out.println("This is circle-Abstract method");
    }
    void triangle()
    {
        System.out.println("This is triangel");
    }//its my class methode
    public static void main(String[] args)
    {

        //scenario 1
        Implclass x=new Implclass(); //instantiate class & object reference for class
        x.circle(); //abstract
        x.square(); //default
        InterfaceClasseDemo.rectangle(); //static
        x.triangle(); // able to access

        //scenario 2
       InterfaceClasseDemo it=new Implclass();
       it.circle();
       it.square();
       InterfaceClasseDemo.rectangle();
       //it.triangle();// can not access, as InterfaceclassDemo does not contain triangle

     System.out.println(InterfaceClasseDemo.length + InterfaceClasseDemo.width);//static variables access anywhere direcly


    }
}
