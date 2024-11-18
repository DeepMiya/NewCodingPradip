package javaQuetionsPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate_String_With_Count {

    public static void main(String [] arg)
    {
        String sentence="India is my country and I am living in India and I love my country country";
        String [] arOfStr=sentence.split(" ");
        Set<String> uniqString=new HashSet<>();
        Map<String, Integer> duplicateString = new HashMap<>();

        for (String s:arOfStr)
        {
            if (!uniqString.add(s))
            {
                duplicateString.put(s,duplicateString.getOrDefault(s,1)+1);
            }
        }
        System.out.println(duplicateString);


    }
}
