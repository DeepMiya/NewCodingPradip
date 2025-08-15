package javaConcepts.ByRahulShetty.superKeyword;

public class ChildA extends ParentP {
    String name="Avdhoot";
    public void getData()
    {
        System.out.println(name);
        System.out.println(super.name); //variable
    }
    public void getId()
    {
        super.getId();//first go to parent class //methode access
        System.out.println("I am child class method");
    }
    public ChildA()
    {
        super();//we user super & () for constructor calling from parent first then child
        //at the time of object creation constructor will call first
        System.out.println("Child Class Constructor");
    }
    public static void main(String[] args)
    {
        ChildA x=new ChildA();
        x.getData();
        x.getId();
    }
}

