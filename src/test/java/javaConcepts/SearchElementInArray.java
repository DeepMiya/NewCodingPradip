package javaConcepts;

public class SearchElementInArray {
    public static void main(String[] args) {

        int a[] = {10, 20, 300, 40};

        int search_element = 300;
        boolean status=false; //not found =false, found =true

        for (int x : a)
        {
            if(x==search_element)
            {
                System.out.println("Element fond");
                status=true;
                break;
            }
        }
        if(status==false) {
            System.out.println("Element not found");
        }
    }
}