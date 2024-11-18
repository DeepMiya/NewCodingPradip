package javaQuetionsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate_arrayToSet {
    public static void main(String[] args)
    {
        String str="my name is pradip pawar pawar is my sir name";
        String [] arrStr=str.split(" ");
       List<String> listofStr= Arrays.asList(arrStr);
       Set<String> removedDuplicates=new HashSet<>(listofStr);
        System.out.println(removedDuplicates);

       for(String s:removedDuplicates)
       {
        //   System.out.println(s);
       }


    }

}
