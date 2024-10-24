import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the number");
        int n = sc.nextInt();
    
        for (int i = 0; i < n; i++) {
            System.out.println("enter the numbers of element");
            int number = sc.nextInt();
            if (number % 2 != 0) 
            { 
                sum += number; 
            }
        }
        System.out.println("sum of the odd elements "+sum);
        
    }
}
