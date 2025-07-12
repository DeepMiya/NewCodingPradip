package javaConcepts;

public class StringReverse {

    public static void main(String[] args)
    {
        String name="welcome";
        String revstr="" ;
/*using character array
       char[] a= name.toCharArray();
       for (int i=name.length()-1;i>=0;i--)
       {
           revstr=revstr+a[i];
       }
       System.out.println(revstr);
*/
//using charAt
        for(int i=name.length()-1;i>=0;i--)
        {
            revstr=revstr + name.charAt(i);
        }
        System.out.println(revstr);
//Using StringBuilder
    String revbud=new StringBuilder(name).reverse().toString();
    System.out.println(revbud);

/* String s="john"; -- not possible in StringBuffer and String Bulder
String st =new String ("John");
String is Immutable--we can not change

 StringBuffer sbf=new StringBuffer("John");
 StringBuffer sbb=new StringBuilder("John");
 StringBuffer and Builder are mutable --can change using append()


 */


    }
}
