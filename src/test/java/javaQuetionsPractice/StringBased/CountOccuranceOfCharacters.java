package javaQuetionsPractice.StringBased;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfCharacters {
    public static void main(String[] args) {
        String name = "I am living in India";
        //convert string to Lowercase
        name = name.toLowerCase();

        //remove space if you don't want
        name=name.replaceAll(" ","");
        System.out.println(name);

        Map<Character,Integer> countOfCharMap=new HashMap<Character,Integer>();

        for (char c:name.toCharArray())
                {
                    if(countOfCharMap.containsKey(c))
                    {
                        countOfCharMap.put(c,countOfCharMap.get(c)+1);
                    }
                    else
                    {
                        countOfCharMap.put(c,1);
                    }

                }
        //System.out.println(countOfCharMap);
        for(Map.Entry<Character,Integer>en:countOfCharMap.entrySet())
        {
            System.out.println("Character:"+en.getKey()+"' :"+en.getValue());

        }

    }
}