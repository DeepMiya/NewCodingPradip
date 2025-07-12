package javaConcepts;

public class StaticDemo {
    static int a=10;//static variable
    int b=20;//non static variable

    static void m1()//static method
    {
        System.out.println("Static methode-----");

    }
    void m2()//non static method
    {
        System.out.println("Non Static method-----");

    }
    void m()//non static method -non Static methods can access everything directly
    {
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

    public static void main(String [] args)
    { /*Static Methods can access static stuff directly(Without object)
        System.out.println(a);
        m1();
       System.out.println(b);//without obj creation unable to access
        m2();
        m();
        */

        StaticDemo sd =new StaticDemo();
        sd.m2();
        System.out.println(sd.b);
        sd.m();
    }


}
