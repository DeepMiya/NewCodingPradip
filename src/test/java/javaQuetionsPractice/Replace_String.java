package javaQuetionsPractice;

public class Replace_String {
    public static void main(String [] args)
    {
        String origString="my name is Pradip. I love my country. I live in Pine";
        String repStr=origString.replace("is", "was");
        String repAllStr=origString.replaceAll("my","His");
        System.out.println(repStr);
        System.out.println(repAllStr);
    }
}
