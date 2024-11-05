package ControlFlowExamples;
import java.util.Scanner;


public class PosiNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        sc.close();
        if(num<0)
        {
            System.out.println("number is negative");
        }
        else
        {
            System.out.println("number is positive");
        }
        System.out.println("Statement outside if...else block");
    }

}
