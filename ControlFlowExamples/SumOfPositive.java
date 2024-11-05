package ControlFlowExamples;
import java.util.Scanner;

public class SumOfPositive {
    public static void main(String[] args) {
      
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
           
        while (number >= 0) {
          sum = sum+number;
          System.out.println("Enter a number");
          number = sc.nextInt();
        }
           
        System.out.println("Sum = " + sum);
        sc.close();
      }
}
