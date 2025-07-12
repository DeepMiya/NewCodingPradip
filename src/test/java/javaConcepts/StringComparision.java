package javaConcepts;

public class StringComparision {

    public static void main(String[] args)
    {
        /*case 1
        String s1="welcome";
        String s2="welcome"; //objects are same/equals

        System.out.println(s1==s2);  //true
        System.out.println(s1.equals(s2));  //true
       case 2
        String s1= new String("welcome"); //create s1 object in memory
        String s2=new String("welcome");  //create s2 object in memory
        System.out.println(s1==s2); //false ..."==" to compare the objects
        System.out.println(s1.equals(s2)); //true ...to compare the values of objects

        case 3

        String s1="welcome";
        String s2=new String("welcome");
        System.out.println(s1==s2); //false   objects are different
        System.out.println(s1.equals(s2)); //true

        Case 4
*/
        String s1="welcome";
        String s2=new String("welcome");
        String s3=s2;
        System.out.println(s1==s2);//false
        System.out.println(s2==s3);// objects are same true
        System.out.println(s1.equals(s2)); //true

    }
}
