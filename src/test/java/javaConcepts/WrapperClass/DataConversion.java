package javaConcepts.WrapperClass;

public class DataConversion {

    public static void main(String []args)
    {
        /*
       // String s="welcome";//can not cover show numberformat exception
        String d="123456";
        int a=Integer.parseInt(s);
        int b=Integer.parseInt(d);
        System.out.println(d);

        Boolean f=Boolean.parseBoolean(d);
        System.out.println(f);
        //other than String value "true", will get result as false
        String nn="true";
        Boolean hh=Boolean.parseBoolean(nn);
        System.out.println(hh);
*/
        //premitive types to string
        //String is not wrapper class
        int x=10;
        char grade='A';
        double roi=10.75;
        boolean result=false;

        System.out.println(String.valueOf(x));
        System.out.println(String.valueOf(grade));
        System.out.println(String.valueOf(roi));
        System.out.println(String.valueOf(result));




    }

}
