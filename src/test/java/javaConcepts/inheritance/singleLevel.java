package javaConcepts.inheritance;
class a
{
    int a=10;
    void display()
    {
        System.out.println(a);
    }
}
class b extends a //cant make it public
{
    int b=20;
    void view()
    {
        System.out.println(b);
    }

} //multilevel
class c extends b
{  int c=30;
    void show()
    {
        System.out.println(c);
    }

}

public class singleLevel {   // there should be only one public class in one java file

    public static void main(String[] args)
    {
      /* Single
       b bobj=new b();
       System.out.println(bobj.a); //access parent class variables and methods
       bobj.display();
       System.out.println(bobj.b);
       bobj.view();
*/
        /* Multilevel*/
        c cobj=new c();
        cobj.show();
        cobj.display();
        cobj.view();




    }
}
