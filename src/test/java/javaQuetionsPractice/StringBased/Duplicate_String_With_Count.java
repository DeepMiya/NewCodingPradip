package javaQuetionsPractice.StringBased;

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
                /*
                getOrDefault(Object key, V defaultValue)
                key – The key to look up in the map
               defaultValue – The value to return if the key is not found
                it helps to avoid null when a key is missing by returning a default value instead.
                 */
            }
        }
        System.out.println("Duplicates:"+duplicateString);//duplicate


    }
}
