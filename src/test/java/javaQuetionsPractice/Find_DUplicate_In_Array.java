package javaQuetionsPractice;

import java.util.HashSet;
import java.util.Set;

public class Find_DUplicate_In_Array {
    public static void main(String [] args)
    {
        int [] numbers={1,2,3,4,2,3,4,5};
        Set<Integer> uniq=new HashSet<>();
        Set<Integer> duplicate=new HashSet<>();

        for (int num:numbers)
        {
            if (!uniq.add(num))
            {
                duplicate.add(num);
            }
        }
        //System.out.println(duplicate);

    }
}
