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
                mpcount.put(c, mpcount.getOrDefault(c,0)+1); /*

                getOrDefault(Object key, V defaultValue)
key – The key to look up in the map

defaultValue – The value to return if the key is not found */

            }
        }System.out.println(mpcount);
    }
}
