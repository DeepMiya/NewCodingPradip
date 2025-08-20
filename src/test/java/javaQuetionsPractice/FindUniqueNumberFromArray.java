package javaQuetionsPractice;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueNumberFromArray {
    public static void main(String[] args)
    {
        int a[]={4,5,5,5,4,9,4};
        System.out.println("Unique number using nested for loop..........");
        for(int i=0;i<a.length;i++)
        {
            int count=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(a[i]);
            }
        }
//another way by using map
        System.out.println("Unique number Using Map....");
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int num:a)
        {
            map.put(num,map.getOrDefault(num,0)+1);//count frequency
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> un:map.entrySet())
        {
           if( un.getValue()==1)
           {
               System.out.println(un.getKey());

           }

        }

    }


}
