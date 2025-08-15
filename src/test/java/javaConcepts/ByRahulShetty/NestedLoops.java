package javaConcepts.ByRahulShetty;

public class NestedLoops {
    public static void main(String[]args)
    {
        /*
        //nested loop
        for(int i=1;i<=4;i++)//loop will execute 4 times
        {
            for(int j=1; j<=4; j++)//loop will execute 4 times
            {
                System.out.println("Inner Loop");
            }
            System.out.println("outer loop");
        }
        */
        /*
            1 2 3 4
            5 6 7
            8 9
            10
         */
        int num = 1; // starting number
        int rows = 4; // total rows

        for(int i=rows;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        /*
        1
        2 3
        4 5 6
        7 8 9 10
         */
        int x=1;
        for (int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();

        }






    }
}
