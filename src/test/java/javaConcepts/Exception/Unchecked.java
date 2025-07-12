package javaConcepts.Exception;

public class Unchecked {
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
            System.out.println("Cought ArithmeticException");
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
