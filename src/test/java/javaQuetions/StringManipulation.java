package javaQuetions;

public class StringManipulation {

//    public static String reverseString(String sentence1)
//    {
//        String[] splStr=sentence1.split(" ");
//        String resv="";
//        for (int i=splStr.length-1;i>=0;i--)
//        {
//            resv+=splStr[i] + " ";
//        }
//        return resv;
//    }

    public static void main(String [] args)
    {
        String sentence="Java is Automation Testing";
        String [] words=sentence.split(" ");
        String reverse=" ";

        for (int i=words.length-1;i>=0;i--)
        {
           reverse += words[i] + " ";//keep in mind that ! in (i) as its array so [i]
        }
        reverse.trim();
        System.out.println(reverse);


        //another way
//        String sentence1="I love my country";
//        System.out.println(reverseString(sentence1));



    }

}
