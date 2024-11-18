package javaQuetionsPractice;

import java.util.HashMap;
import java.util.Map;

public class FindNumberOfCharacters {

    public static void main (String [] args)
    {
        String name="welcome india";
        char[] chr=name.toCharArray();
        Map<Character,Integer> countOfChars=new HashMap<>();
        for (char c:chr)
        {
            if (c!=' ')
            {
               countOfChars.put(c, countOfChars.getOrDefault(c,0)+1) ;
            }
        }
        System.out.println(countOfChars);



    }
}
