package Hackathon;


import java.util.Scanner;

public class perfectNum { 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        
        if (num < 1) {
            System.out.println("this number is bellow zero or negative");
        } else {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num%i==0) 
                {
                    sum =sum+i;
                }
            }
            if (sum == num) {
                System.out.println("PERFECT");
            } else {
                System.out.println("NOT PERFECT");
            }
        }
        sc.close();
    }
}
