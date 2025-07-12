package javaQuetions;

import java.util.HashMap;
import java.util.Map;

public class characterCount {
    public static void main(String [] args)
    {
        String name="automation";
        Map<Character,Integer> mpcount=new HashMap<>();
        for (char c:name.toCharArray())
        {
            if (c!=' ')
            {
                mpcount.put(c, mpcount.getOrDefault(c,0)+1);
            }
        }System.out.println(mpcount);
    }
}
