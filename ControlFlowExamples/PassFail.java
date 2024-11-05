package ControlFlowExamples;

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks");
        float marks = sc.nextFloat();
        String result = (marks>=40)? "pass":"fail";
        System.out.println("your result = "+ result);
        sc.close();
    }
    
}
