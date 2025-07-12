package starPattern;

public class RightAngleTrianglePattern {

    public static void main(String [] args)
    {
        int n=5;
        for (int i=1;i<=n;i++)//5 rows
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
