package javaQuetionsPractice;

public class PalendromString {
    public static void main(String [] args)
    {
        String name="ada";
        String reverseString = "";
        for (int i=name.length()-1;i>=0;i--)
        {
          reverseString=reverseString + name.charAt(i);
        }
        System.out.println(reverseString);
        if(reverseString.equals(name))
        {
            System.out.println("Its a pallendrom String");
        }
        else
        {
            System.out.println("non pallendrom") ;       }
    }
}
