package javaQuetionsPractice;

public class LeapYear {

    public static void main(String[] args) {


        int startYear = 2000;
        int tillYear = 3000;

        for (int i = startYear; i <= tillYear; i++)
        {
            if (i%400==0 && i%100==0 || i%4==0 && i%100!=0)
            {
                System.out.println(i + "is leap year");
            }


        }
    }
}
