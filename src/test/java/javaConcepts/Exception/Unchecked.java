package javaConcepts.Exception;

public class Unchecked {
    /*
🔹 These are runtime exceptions – the compiler does NOT force you to handle them.
🔹 They usually represent programming mistakes (bugs, invalid inputs, logic errors).

Examples:
NullPointerException
ArrayIndexOutOfBoundsException
ArithmeticException (like divide by zero)
     */
    public static void main(String[] args)
    {
        int a=10;
        int b=0;
        try {
            int div = a / b;
            System.out.println(div);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cought ArithmeticException"+e.getMessage());
        }
        finally { //executed any time
            System.out.println("Progam ended");
        }
        try {
            String str = null;
            System.out.println(str.length());  // NullPointerException
        } catch (Exception e) {//or mention NullPointerException insted of Exception
            System.out.println("Caught NullPointerException");
        }

    }
}
