package javaQuetionsPractice;

public class TribonacciSeries {
    public static void main(String [] args)
    {
        int n1=1;
        int n2=2;
        int n3=3;
        int tillNumber=50;

        for(int i=4;i<=tillNumber;i++)
        {
            int n4=n1+n2+n3;
            if(n4>tillNumber) //till number 10 only will give you result
            {
                break;
            }
            System.out.println(n4);
            n1=n2;
            n2=n3;
            n3=n4;
        }
    }
}
