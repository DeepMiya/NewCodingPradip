package javaConcepts;

public class Regex {
    public static void main(String[] args)
    {
        //Digit only
        int number=3234342;
        String strNumber=String.valueOf(number);//Int to String
        System.out.println("Digit only:"+strNumber.matches("^\\d+$"));
        String digits = "12345";
        System.out.println("Digits only: " + digits.matches("^[0-9]+$"));
        //letters Only
        String name="Pradip";
        boolean result=name.matches("^[a-zA-Z]+$");
        System.out.println(result);
        //Letters and numebers
        String names="Pradip123";
        System.out.println("Letters Only:"+names.matches("^\\w+$"));
        // 4. Indian Phone Number
        String phone = "9876543210123";
        System.out.println("Valid Indian phone: " + phone.matches("^[6-9]\\d{9}+$")); // true

        // 5. PAN Card (ABCDE1234F)
        String pan = "ABCDE1234F";
        System.out.println("PAN Card Number:"+pan.matches("^[A-Z]{5}\\d{4}[A-Z]{1}"));

        //Remove digit
        String textWithDigits = "abc123xyz45";
        String textWithoutDigit=textWithDigits.replaceAll("\\d","");
        System.out.println("Text Without Digit:"+textWithoutDigit);





    }
}
