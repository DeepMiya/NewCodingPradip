package javaConcepts;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArrays {

    public static void main(String [] args)
    {
        int []a={500,200,700,100};

        System.out.println("Before Sorting-----:"+Arrays.toString(a));
        Arrays.sort(a);//ascending
        System.out.println("After Sorting -----"+Arrays.toString(a));

        //Descending
        Integer[] b={3,1,6,7,4,9,3};
        Arrays.sort(b, Collections.reverseOrder()); // Sort in descending order
        System.out.println("Array in descending order: " + Arrays.toString(b));


    }
}
