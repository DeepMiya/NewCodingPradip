package starPattern;

public class PrimeNumberBetween {
    public static void main(String[] args)
    {
        int n1=1;
        int lastNumber=10;
        for (int i=n1;i<=lastNumber;i++)
        {
            int count =0;
            for (int j=n1;j<=i;j++)
            {
                if(j>0)
                {
                    if (i % j == 0)
                    {
                        count++;
                    }
                }

            }
            if(count<=2)
            {
                System.out.println("Prime number:"+i);
            }
        }
    }
}
