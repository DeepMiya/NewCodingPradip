package javaConcepts.ByRahulShetty;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

    public static void main(String[] args)
    {
        Date d=new Date();
       // System.out.println(d);
        System.out.println(d.toString());

        SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
        sdf.format(d);//
        System.out.println(d.toString());
        SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        sdf.format(d);//
        System.out.println(d.toString());



    }
}
