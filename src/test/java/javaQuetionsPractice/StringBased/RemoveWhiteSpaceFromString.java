package javaQuetionsPractice.StringBased;

public class RemoveWhiteSpaceFromString {
    public static void main(String[] args)
    {
        //remove white spaces from string
        String input="i am pra  dip pa war";
        String repString=input.replaceAll("\\s","");
        System.out.println(repString);


    }
}
