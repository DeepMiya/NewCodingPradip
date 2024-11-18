package javaQuetionsPractice;

public class FactorialNumber {

    public  static void main(String[] args)
    {
        int number=5;
        int factorialNumber=1;

        for (int i=number;i>=1;i--)
        {
            factorialNumber=factorialNumber*i;
        }
        System.out.println(factorialNumber);
    }
}
