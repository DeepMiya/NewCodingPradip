package starPattern;

import java.util.Scanner;

public class pallendromNumber {
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        int startNumber=sc.nextInt();
        int endNumber= sc.nextInt();

        int pal=0;
        for (int i=startNumber;i<=endNumber;i++)
        {
            int num=i;
            while(num>0)
            {
                int s=num%10;
                pal=(pal*10)+s;
                num=num/10;
            }
            if (pal==i)
            {
//                ArrayList<Integer> listofPallendrom=new ArrayList<Integer>();
//                listofPallendrom.add(i);
                System.out.println(i);
            }
            pal=0;

        }


    }
}
