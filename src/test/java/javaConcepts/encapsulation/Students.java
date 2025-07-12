package javaConcepts.encapsulation;

public class Students {

    int id;
    private int accountNumber;
    private String name;

    //Encapsulation used for security and privacy, to get the variable use getter and set variable vaule use setter

   public void setAccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber()
    {
        return accountNumber;

    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }




}
