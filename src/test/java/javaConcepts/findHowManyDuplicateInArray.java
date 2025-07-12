package javaConcepts;

public class findHowManyDuplicateInArray {

    public static void main(String[] args)
    {
        int a[]={100,200,300,100,200,100,100};
        int num=200;
        int count=0;

        for(int x:a)
        {
            if (x==num)
            {
                count ++;
            }
        }
        System.out.println(count);
    }
}
