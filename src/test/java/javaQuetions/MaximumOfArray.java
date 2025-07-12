package javaQuetions;

public class MaximumOfArray {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 2, 1, 7, 5, 9};
        int max = numbers[0];
        for (int num : numbers)
        {
            if (num > max) max = num;

        }
        System.out.println(max);


    }
}
