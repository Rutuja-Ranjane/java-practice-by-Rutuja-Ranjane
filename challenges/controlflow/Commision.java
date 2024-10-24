package controlflow;

import java.util.Scanner;

public class Commision {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sales range :-");
        int sale_range = sc.nextInt();

        if (sale_range > 10000) 
        {
            System.out.println("Commision with 30% is :- " + (0.3)/sale_range); 
        } 
        else if (sale_range> 5000 && sale_range < 10000)
        {
            System.out.println("Commision with 20% is :- " + (sale_range*20)/100);
        } 
        else if (sale_range >= 1001 && sale_range<= 4999) 
        {
            System.out.println("Commision with 10% is :- " + (sale_range*10)/100);  
        } 
        else 
        {
            System.out.println("No commision for sales below $1000.");
        }

        sc.close();
    }
}
