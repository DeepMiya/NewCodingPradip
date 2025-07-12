package starPattern;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {

        String sentence = "my name is pradip pawar and pawar is my sir name";
        String [] strarr=sentence.split(" ");
        Set<String> uniqString=new HashSet<>();

        for (String s:strarr)
        {
            uniqString.add(s);
        }
        System.out.println(uniqString);

        //another way
        List<String> ll=Arrays.asList(strarr);
        Set<String> remvDuplicate=new HashSet<>(ll);
        System.out.println(remvDuplicate);


    }
}
