package javaConcepts.Exception;

import java.io.FileInputStream;

public class checkedException {
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
