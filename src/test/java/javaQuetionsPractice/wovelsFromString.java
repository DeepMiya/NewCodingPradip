package javaQuetionsPractice;

import java.util.Scanner;

public class wovelsFromString {
    public static void main(String [] args)
    {
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
    }
}
