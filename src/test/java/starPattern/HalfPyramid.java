package starPattern;

public class HalfPyramid {
    public static void main(String [] args)
    {
        int n=5;
        for (int i=1;i<=n;i++)//no of rows
        {
            for (int j=i;j<=n;j++)
            {
                System.out.print("  "); //dec space
            }
            for (int j=1;j<=i;j++)//incr *
            {
                System.out.print("* ");
            }
            for (int j=1;j<i;j++) //ince * with one colum reduced
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
