import java.util.*;
public class Disc {
    public static void main(String[] args) {
        double price = 700.0; // Use double for price
        Scanner sc = new Scanner(System.in); // Added '=' sign
        
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age < 5) {
            double discountAmount = price * 0.60; // Calculate discount
            double finalAmount = price - discountAmount; // Calculate final amount
            System.out.printf("Your age is below 5. You have a 60%% discount. Your amount is: €%.2f%n", finalAmount);
        } else if (age > 60) {
            double discountAmount = price * 0.55; // Calculate discount
            double finalAmount = price - discountAmount; // Calculate final amount
            System.out.printf("Your age is above 60. You have a 55%% discount. Your amount is: €%.2f%n", finalAmount);
        } else {
            System.out.printf("You don't have any discount. Your amount is: €%.2f%n", price);
        }
        
        sc.close(); // Close the scanner
    }
}
