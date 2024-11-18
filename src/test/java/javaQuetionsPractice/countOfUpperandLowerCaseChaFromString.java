package javaQuetionsPractice;

public class countOfUpperandLowerCaseChaFromString {

    public static void main(String [] args)
    {
        String str="HeLLo Good Morning!!!";
        int lowerCase=0;
        int upperCase=0;
        for (char c:str.toCharArray())
        {
            if (c>='a' && c<='z')
            {
                lowerCase++;
            }else if (c>='A' && c<='Z'){

                upperCase++;
            }
        }
        System.out.println("UpperCase:"+upperCase+"\nLowerCase:"+lowerCase);

    }

}
