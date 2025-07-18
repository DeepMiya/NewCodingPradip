package starPattern;

public class ReverseWords
{
    public static void main(String[] args)
    {

        //Reverse characters
        String sentence="My name is pradip shivaji Pawar i am from beed";
       /*
        StringBuilder sb=new StringBuilder(sentence);
        String revStrig=sb.reverse().toString();
        System.out.println(revStrig);
*/
        //Reverse words
        String [] names=sentence.split(" ");
        StringBuilder sbd=new StringBuilder();
        for(int i=names.length-1;i>=0;i--)
        {
            sbd.append(names[i]).append(" ");
        }
        System.out.println(sbd.toString().trim());





    }
}
