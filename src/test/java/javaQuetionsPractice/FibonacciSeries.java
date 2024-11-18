package javaQuetionsPractice;

public class FibonacciSeries {
   public static void main (String [] args)
   {
       int n1=1;
       int n2=2;
       int tillnumber=10;
     //  int n3;

       for (int i=3;i<=tillnumber;i++)
       {
           int n3=n1+n2;
           System.out.println(n3);
           n1=n2;
           n2=n3;

       }

   }

}
