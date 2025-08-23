package javaConcepts;

import java.util.Scanner;

public class  CatchBlock {

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter valid number:"); //0
        int num=sc.nextInt();
        System.out.println("Please enter your name");
        String name=sc.next();

        System.out.println(num);
        System.out.println(name);

        int a=10/num; //10/0
        try {
            System.out.println(a);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
