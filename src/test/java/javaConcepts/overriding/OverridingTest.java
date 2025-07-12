package javaConcepts.overriding;
class Bank
{
    double roi()// declaration should be same
    {
        return 0;// implementation can be change
    }
}
class ICICI extends Bank
{
    double roi()
    {
        return 10.43;
    }
}
class SBI extends Bank
{
    double roi()
    {
        return 12.02;
    }
}


public class OverridingTest {

    public static void main(String [] args)
    {
        ICICI x=new ICICI();
        System.out.println(x.roi());
        SBI y=new SBI();
        System.out.println(y.roi());

    }
}
