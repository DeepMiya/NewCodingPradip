package starPattern;

public class ReverseString {

    public static void main (String [] args)
    {
        String name="My India";
        String revString="";
        for (int i=name.length()-1;i>=0;i--)
        {
            revString+=name.charAt(i);
        }
        System.out.println(revString);

        //another way

        StringBuilder sb=new StringBuilder(name);
        String sbrev=sb.reverse().toString();
        System.out.println(sbrev);

    }
}
