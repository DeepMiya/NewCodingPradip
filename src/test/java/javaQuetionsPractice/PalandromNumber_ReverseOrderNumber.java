package javaQuetionsPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class PalandromNumber_ReverseOrderNumber {
    public static void main(String [] args)
    {
        int num=121;
        int actNum=num;
        int palendromNum=0;
        while(num>0)
        {
            int i=num%10;//reminder
            palendromNum=(palendromNum*10)+i;
            num=num/10;//
        }

            if (actNum==palendromNum)
            {
                System.out.println("Its an palendrom number");
            }else
            {
                System.out.println("Its not an pallendrom number");
            }
        System.out.println("Type2:between 2 numbers ");

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter First Number");
            int firstNumber=sc.nextInt();
            System.out.println("Enter second Number");
            int secondNumber=sc.nextInt();

            int sum=0;
            for (int i=firstNumber;i<=secondNumber;i++)
            {
               int number=i;
                while(number>0)
                {
                    int reminder=number%10;
                    sum=(sum*10)+reminder;
                    number=number/10;
                }
                if (sum==i)
                {
                    ArrayList<Integer> c = new ArrayList<Integer>();
                    c.add(i);
                    System.out.println(i);
                }
                sum=0;
            }

    }

}
