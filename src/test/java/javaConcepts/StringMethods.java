package javaConcepts;

public class StringMethods {
    public static void main(String[] args)
    {
/*        //trim- remove left and right side spaces
        String name="         Welcome    ";
        System.out.println(name.length());
        System.out.println(name.trim().length());
        //chartAt()-returns character form string based on index
        //index start from 0
         String s="Pradip";
         System.out.println(s.charAt(2));
         //Contains- returns true or false
        System.out.println(s.contains("Rad")); //case sensitive,

        //Compaire strings--equals(), equalsIgnoreCase()

        String s1,s2;
        s1="welcome";
        s2="WelCome";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("welcome"));
        System.out.println(s1.equalsIgnoreCase(s2));

        //replace()--replce character/string

        //substring(start index, end index)--extract substring from the main string
        //Starting index start from 0  & ending index start from 1
*/

        String sb="welcome";
        System.out.println(sb.substring(1,4));

       //split()-split the string into multiple parts bases on delimiter(,. @ etc)
        String s1="abc@gmail.com";
       String [] a= s1.split("@");
       System.out.println(a[0]);
        System.out.println(a[1]);







    }
}
