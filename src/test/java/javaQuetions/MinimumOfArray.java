package javaQuetions;

public class MinimumOfArray {
    public static void main(String [] args)
    {
        int []numbers={5,6,8,2,5,1};
        int min=numbers[0];
        for(int a:numbers)
        {
            if(a<min) min=a;
        }
        System.out.println(min);
    }
}
