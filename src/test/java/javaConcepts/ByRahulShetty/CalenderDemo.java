package javaConcepts.ByRahulShetty;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {
    public static void main(String[]args)
    {
        /*
Calendar → A class in Java (java.util.Calendar) used for working with dates and times.
getInstance() → A static method that returns a Calendar object set to the current date and time in your system’s default timezone and locale.
         */
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//("M/d/yyyy");
        System.out.println(sdf.format(cal.getTime()));
        System.out.println(sdf.getTimeZone());
        System.out.println(sdf.getCalendar());
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
    }

}
