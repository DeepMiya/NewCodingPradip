package javaConcepts;

/*An array is a collection of elements of the same data type stored in a contiguous memory location
* Indext start from 0
* Length find= arrayvaiable.lenghth
* Types- 1D, 2D
*
* */


import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Arrays {

    public static void main(String[] args) {


//Single Diamention
    //Declare array
    /*Approach 1
    int []a = new int[3];
    a[0]=10;
    a[1]=20;
    a[2]=30;
    a[3]=40;  ///aray index out of bound exeption
   */
        /* Approach 2 */

        int b[]={100,200,300,400};


        //Find length of an array
        System.out.println("Lenght of an array:"+b.length);
        //read single value from array
        System.out.println("Read single value"+b[3]);
        //read all vaules from array
        //by normal for loop
        for(int i=0;i<b.length;i++) // i<=4 i<=b.length-1
        {
            System.out.println(b[i]);
        }
        //by enhanced for loop
        for(int x:b)
        {
            System.out.println(x);
        }

        System.out.println("====================================================2D====================================");

        /* a[row index][column index]


        /*Declare array
        Approach 1


        int d2[][]=new int [2][2];
        d2 [0][0]=9;
        d2[0][1]=8;

        d2[1][0]=5;
        d2[1][1]=10;
*/

        //Approach 2

        int dmul[][]={
                {1,2},
                {3,4},
                {5,6}
        };
        //find size
        System.out.println("Row's number: "+dmul.length);
        System.out.println("Column's numbers in 1st row: "+dmul[0].length);

        //read single vaule
        System.out.println(dmul[0][1]);

        //read all
        //Normal for
        for (int r=0;r<= dmul.length-1;r++)
        {
            for (int c=0;c<=dmul[r].length-1;c++)
            {
                System.out.print(dmul[r][c]+" ");
            }
            System.out.println();
        }
        //Enhanced for loop
        for(int ro[]:dmul) //e.g store [1,2]
        {
            for (int x:ro) // e.g return 1 , 2
            {
                System.out.print(x+" "); //use print so result will be as like table structure , Concat with space due to space in between two values
            }
            System.out.println();
        }
        System.out.println("====================Heterogenius Array (can store heterogenios data in array====================");

        Object [] ht={100,10.54,"Pink",'A',true};

        for(Object x:ht)
        {
            System.out.println(x);
        }






}
}
