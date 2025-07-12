package javaConcepts.encapsulation;

public class StudentsMainClass {
    public static void main(String[] args)
    {
        Students st=new Students();
        st.id=100;// if variable is non private
        //private variable not accesible
        st.setAccountNumber(123456);
       System.out.println( st.getAccountNumber());

       st.setName("Pradip");
       System.out.println(st.getName());

    }
}
