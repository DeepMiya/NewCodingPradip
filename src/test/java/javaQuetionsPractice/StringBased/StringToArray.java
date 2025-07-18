package javaQuetionsPractice.StringBased;

public class StringToArray {
    public static void main(String[] args)
    {
        String name="pradip is my name";
        String [] sr=name.split(" ");
        for (String s:sr)
        {
            System.out.println(s);
        }

        String name1="pradip,shraddha,pawar,arvil";
        String [] star=name1.split(",");
        for (String f:star)
        {
            System.out.println(f);
        }
    }
}
