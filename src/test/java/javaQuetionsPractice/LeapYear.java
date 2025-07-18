package javaQuetionsPractice;

public class LeapYear {

    public static void main(String[] args) {


        int startYear = 2000;
        int tillYear = 3000;

        for (int i = startYear; i <= tillYear; i++)
        {
            /*
                It is divisible by 4

              But not divisible by 100,

              Unless it is also divisible by 400
             */
            if (i%400==0 && i%100==0 || i%4==0 && i%100!=0)///(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
            {
                System.out.println(i + "is leap year");
            }


        }
    }
}
