package javaQuetionsPractice;

public class PimeNumberBetween2Number {
    public static void main(String[] args) {

        int startNumber=2;
        int endNumber=10;

        for (int i=startNumber;i<=endNumber;i++)
        {
            int count=0;
            for (int j=1;j<=i;j++)
            {
                if(j>0)
                {
                    if(i%j==0)
                        count++;
                }
            }
            if (count==2)
            {
                System.out.println(i+"is prime number");
            }
        }
    }
}


