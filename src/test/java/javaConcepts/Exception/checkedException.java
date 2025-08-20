package javaConcepts.Exception;

import java.io.FileInputStream;

public class  checkedException {
    /*
🔹 These are compile-time exceptions – the compiler forces you to either handle them with try-catch or declare them with throws.
🔹 They usually represent recoverable situations (things that can be handled gracefully).

Examples:
IOException (when reading/writing files)
SQLException (when working with databases)
ClassNotFoundException
     */
    public static void  main(String[] args) throws InterruptedException {//using throws
        System.out.println("Program started..........");
        Thread.sleep(5000);

        //using try cathc
        try {
            FileInputStream file = new FileInputStream("C:\\test.txt");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

}
