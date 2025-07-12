package javaConcepts.casting;

public class TypeCasting {
     public static void main(String[] args)
     {
         //upcasting
         int a=10;
         long lg=a;
         float ft=a;
         System.out.println(ft);
         //downcasting
         long time=10000;
         int x= (int) time;

         float val=10.003f;
         int y=(int)val;
         System.out.println(y);

     }
}
