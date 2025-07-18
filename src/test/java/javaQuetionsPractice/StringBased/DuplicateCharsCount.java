package javaQuetionsPractice.StringBased;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsCount {

    public static void main(String[] args){
        String name="Pradip Pawar";
        String loName=name.toLowerCase();
        char[] ch=loName.toCharArray();
        Set<Character> uniqChar=new HashSet<>();
        Map<Character,Integer> countOfDuplicates=new HashMap<>();

        for (char s:ch)
        {
            if (s!=' ')
            {
                if (!uniqChar.add(s))
                {
                    countOfDuplicates.put(s,countOfDuplicates.getOrDefault(s,1)+1);

                }
            }

        }
        System.out.println(countOfDuplicates);


    }
}
