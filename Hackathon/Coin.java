package Hackathon;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the money");
        int amount = sc.nextInt();
        int[] denominations = {1, 2, 5}; 
        int count = 0;
        int remaining = amount;

        for (int i = denominations.length - 1; i >= 0; i--) {
            while (remaining >= denominations[i]) {
                remaining =remaining-denominations[i]; 
                count++;
            }
        }

        if (remaining == 0) {
            System.out.println(count); 
        } else {
            System.out.println("NOT POSSIBLE");
        }
        sc.close();
    }
}