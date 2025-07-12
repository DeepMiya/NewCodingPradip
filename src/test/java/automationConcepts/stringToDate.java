package automationConcepts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class stringToDate {

    public static void main(String [] args) throws ParseException {
        String strDate="2025-10-07";
        System.out.println("data type:"+strDate.getClass().getName());

    ///Used in Java 7 and older
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        //Days dd, Months MM, Years yyyy, Hours HH, Seconds ss, Minutes mm
        SimpleDateFormat sdf1= new SimpleDateFormat("MM-dd-yyyy");

       Date dt= sdf1.parse(strDate);
       System.out.println(dt);
       System.out.println("data type:"+dt.getClass().getName());

    ////Use in Java 8 and onwards

        String birthdate="23-03-2007"; //format dd-MM-yyyy
        // Create DateTimeFormatter with matching pattern
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dta= LocalDate.parse(birthdate,dtf);
        System.out.println(dta);


    }
}
