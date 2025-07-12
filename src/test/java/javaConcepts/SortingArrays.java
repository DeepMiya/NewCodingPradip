package javaConcepts;
import java.util.Arrays;

public class SortingArrays {

    public static void main(String [] args)
    {
        int []a={500,200,700,100};

        System.out.println("Before Sorting-----:"+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After Sorting -----"+Arrays.toString(a));

    }
}
