package javaQuetionsPractice;

public class LowerRightSidedTrangle {
    public static void main(String[] args)
    {
        //Decreasing space & Increasing *
        int n=5;
        for (int i=1;i<=5;i++)
        {
            for (int j=i;j<=5;j++)
            {
                System.out.print("  ");//2 spaces
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");//one space
            }
            System.out.println();
        }

        // decreasing * &  increasing space

        for (int i=1;i<=n;i++)
        {
            for (int j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
