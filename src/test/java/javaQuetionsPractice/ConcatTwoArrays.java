package javaQuetionsPractice;

import java.util.Arrays;

public class ConcatTwoArrays {

    public static void main(String[] args){
        String fruits[]={"apple","banana"};
        String dryFruits[]={"almond","cashunut"};
        String anyFruits[]=new String[fruits.length + dryFruits.length];
        System.arraycopy(fruits,0,anyFruits,0,fruits.length);
        System.arraycopy(dryFruits,0,anyFruits,fruits.length,dryFruits.length);

        System.out.println(Arrays.toString(anyFruits));
    }
}
