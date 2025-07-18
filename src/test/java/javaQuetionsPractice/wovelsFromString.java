package javaQuetionsPractice;

import java.util.Scanner;

public class wovelsFromString {
    public static void main(String [] args)
    {
        /*
        Scanner sc=new Scanner(System.in);
       String lin =sc.nextLine();
       int wovels=0;
       int consonant=0;

       for (int i=0;i<=lin.length()-1;i++)
       {
           char c=lin.charAt(i);
           if(c!=' ')
           {
               if (c=='a'|| c=='e'|| c=='i'|| c=='o'||c=='u')
               {
                   wovels++;
               } else if(c>='a' && c<='z')
                {
                 consonant++;
               }
           }

       }System.out.println("Wovels :"+wovels+"consonant:"+consonant);
*/
       //2nd another way
        String word = "hello";
        boolean hasVowels = word.matches(".*[aeiouAEIOU].*");

        System.out.println("Contains vowel? " + hasVowels);
        //The first .* = matches anything before the vowel

//       [aeiouAEIOU] = ensures there's at least one vowel

  //      The last .* = matches anything after the vowel


        //count each
        /*word="Hello";
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
    }
}
