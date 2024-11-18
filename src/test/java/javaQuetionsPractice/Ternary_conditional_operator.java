package javaQuetionsPractice;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Ternary_conditional_operator {

    //condition ? expressionIfTrue : expressionIfFalse;
    static int a=10;
    static int b=20;

    public static void main(String[] args){
        int max=(a>b)?a:b;
        System.out.println(max);
    }


}
