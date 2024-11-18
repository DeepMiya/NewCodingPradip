package javaQuetionsPractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacterFromString {

    public static void main(String [] args){
        String name="Pradip Pawar";
        String LowerCase=name.toLowerCase();
        char[] ch=LowerCase.toCharArray();


        Set<Character> uniqueCharacters=new HashSet<>();
        Set<Character> duplicateCharacters=new HashSet<>();

        for(char on:ch)
        {
            if (on!=' ')
            {
                if (!uniqueCharacters.add(on))
                {
                    duplicateCharacters.add(on);
                }

            }
        }
        System.out.println(duplicateCharacters);

    }
}
