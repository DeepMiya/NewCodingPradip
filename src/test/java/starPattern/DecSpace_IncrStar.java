package starPattern;

public class DecSpace_IncrStar {
    public static void main (String [] args)
    {
        int n=5;
        for (int i=1;i<=5;i++) //5 rows
        {
            for(int j=i;j<=n;j++) //dec colum
            {
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++)//incre *
            {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
