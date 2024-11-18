package javaQuetionsPractice;

import java.util.HashSet;

public class DuplicateNumberFromArray {
    public  static void  main(String[] args){
        int []numbers={1,3,4,7,2,3,5,4,8};
        HashSet<Integer> seen=new HashSet<>();
        HashSet<Integer> duplicate=new HashSet<>();

        for (int s:numbers)
        {
            if (!seen.add(s))
            {
                duplicate.add(s);
            }
        }
        System.out.println("duplicate i array"+duplicate);

    }
}
