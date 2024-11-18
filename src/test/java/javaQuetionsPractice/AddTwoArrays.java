package javaQuetionsPractice;

import java.util.Arrays;

public class AddTwoArrays {

    public static void main (String [] args)
    {
        int a[]={1,2,4,5,8,1};
        int b[]={3,2,1,3,1,5,12};
        int arrayMaxLength[]= new int [Math.max(a.length,b.length)];
        int sumOfArray[]=new int[arrayMaxLength.length];

        System.out.println(arrayMaxLength.length);

        for (int i=0;i<arrayMaxLength.length;i++)
        {
/*If the current index is within the bounds of array1,
			use its value; otherwise, use 0*/
            int num1=(i<a.length ? a[i]:0);
            int num2=(i<b.length ? b[i]:0);
            sumOfArray[i]=num1 +num2;
        }
//        for (int ab:sumOfArray)
//        {
//            System.out.println(ab);
//        }
        System.out.println(Arrays.toString(sumOfArray));




    }
}
