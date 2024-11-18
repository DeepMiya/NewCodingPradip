package javaQuetionsPractice;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Even_Odd_Number {

   public static void main(String [] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("---Enter first Number-----");
    int firstNumber=sc.nextInt();
    System.out.println("-----Enter second Number------");
    int secondNumber=sc.nextInt();

    List<Integer> evenNumber=new ArrayList<>();
    List<Integer> oddNumber=new ArrayList<>();



    for (int i=firstNumber;i<=secondNumber;i++)
    {
        if (i%2==0)
        {

            System.out.println(i + "is even number");

        }else
        {
            System.out.println(i+"is odd number");

        }
    }
// we can store in seprate list

       for (int i=firstNumber;i<=secondNumber;i++)
       {
           if (i%2==0)
           {
               evenNumber.add(i);


           }else
           {
               oddNumber.add(i);

           }

       }
       System.out.println(evenNumber);
       System.out.println(oddNumber);
   }

}
