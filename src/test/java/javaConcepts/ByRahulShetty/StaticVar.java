package javaConcepts.ByRahulShetty;

public class StaticVar {
    String name;//Instance variables
    String adderss;
    static String city="Pune";//class variable
    static int i=0;



    public StaticVar(String name,String adderss)//contructor
    {
        //intialize instance variables
        this.name=name;//assign instance varibales
        this.adderss=adderss;
        i++;
        System.out.println(i);
    }
    public void getDetails()
    {
        System.out.println(name+" "+adderss+" "+city);
    }
    public static void getCity()//Static method allows only static stuff
    {
        System.out.println(city);
        //System.out.println(address);//non static not accessible
    }


    public static void main(String[] args)
    {
        StaticVar sv=new StaticVar("Shree","Wagholi");//once after create object contructor will run first
        sv.getDetails();
        StaticVar sv1=new StaticVar("Jid","Kharadi");
        sv1.getDetails();
        StaticVar.getCity();//no need to create object


    }
}
