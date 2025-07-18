package javaQuetionsPractice.StringBased;

public class ReverseString {
    public static void main(String[] args)
    {
        String name="my name is pradip";
        String revString="";
        StringBuilder sb =new StringBuilder(name);
        StringBuilder reverseStr=sb.reverse();
        //String b=sb.reverse().toString();
        System.out.println(reverseStr);
        // another way
        for (int i=name.length()-1;i>=0;i--)
        {
            revString+= name.charAt(i);
        }
        System.out.println(revString);
    }


}
