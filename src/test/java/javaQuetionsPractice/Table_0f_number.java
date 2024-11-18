package javaQuetionsPractice;

import java.util.Scanner;

public class Table_0f_number {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
       int n= sc.nextInt();
       int st;
       for(int i=1;i<=10;i++)
       {
           st=n*i;
           System.out.println(st);
       }



    }
}
