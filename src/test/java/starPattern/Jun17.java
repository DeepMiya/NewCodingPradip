package starPattern;

import io.cucumber.java.sl.In;

import javax.swing.plaf.SeparatorUI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Jun17 {
    public static void main(String[] args){
       int []arr1={1,4,3,0,5};
       int []arr2={3,4,5,9,7};
       int [] sortArr1= Arrays.stream(arr1).sorted().toArray();







       /*
       word=word.toLowerCase();
       Map<Character,Integer> countOfVowels=new HashMap<Character,Integer>();
       for (char c:word.toCharArray())
       {
           if (c!=' ')
           {
               if((c=='a')||( c=='e')||(c=='i')||(c=='o')||(c=='u'))
               {

                   countOfVowels.put(c,countOfVowels.getOrDefault(c,0)+1);
               }
           }
       }
       System.out.println("Vovels present in String");
       System.out.println(countOfVowels);

*/

        /*
        String name="madamhjyty";
        StringBuilder sb= new StringBuilder(name);
        String revString=sb.reverse().toString();
        System.out.println(revString);
        if(name.equals(revString))
        {
            System.out.println("Its pallendrom string");
        }else{
            System.out.println("Not Pallendrom");
        }
*/





/*
        int number=1221;
        int originalNumber=1221;
        int revNumber=0;
        while(number>0) {
                int digit = number % 10;
                revNumber = revNumber * 10 + digit;
                number = number / 10;
        }
        System.out.println(revNumber);
        if (revNumber==number)
        {

            System.out.println("Its pallendrom number");
        }
*/
    }


}
