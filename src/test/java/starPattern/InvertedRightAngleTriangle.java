package starPattern;

public class InvertedRightAngleTriangle {
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1;i<=n;i++)//5 rows
        {
            for(int j=i;j<=n;j++) //colums
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
