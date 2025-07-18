package javaQuetions;

public class PalendromString {
    public static void main(String[] args)
    {
        String name="madamji";
        String pallen="";

        for (int i=name.length()-1;i>=0;i--)
        {
            pallen+=name.charAt(i);
        }
        if(pallen.equals(name))
        {
            System.out.println("its pallendrom sttring");
        }
        else
        {System.out.println("Its not a pallendrom");
        }
        /*
        //2nd way
        String name="madam";
        StringBuilder sb=new StringBuilder(name);
        String revName=sb.reverse().toString();()
        System.out.println(sb.reverse().toString());
        if (name.equals(revName))
        {
            System.out.println("Its Pallendrom String");
        }
        else (System.out.println("Its not pellendrom"));
*/
    }
}
