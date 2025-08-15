package javaConcepts.ByRahulShetty;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {
    public static void main(String[]args)
    {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
        System.out.println(sdf.format(cal.getTime()));
        System.out.println(sdf.getTimeZone());
        System.out.println(sdf.getCalendar());
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

    }

}
