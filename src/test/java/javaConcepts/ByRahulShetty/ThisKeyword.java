package javaConcepts.ByRahulShetty;

public class ThisKeyword {
    //to access global/class variable in same class
    int a=2;//global

    public void getData()
    {
        int a=3;//local variable
        System.out.println(a);
        System.out.println(this.a);//to get global variable
    }
    public static void main(String[] args)
    {
        ThisKeyword tk=new ThisKeyword();
        tk.getData();
    }



}
