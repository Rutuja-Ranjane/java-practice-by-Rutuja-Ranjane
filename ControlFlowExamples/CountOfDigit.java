package ControlFlowExamples;

import java.util.Scanner;

public class CountOfDigit {
    public static void main(String[] args) {
		
		
		// 15487121     8 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number to count : ");
		int num = sc.nextInt();
		
		int count = 0 ;
		
		while(num!=0) {
			
			
			count++;
			num=num/10;
			
			//num = num/10;
			
		}
		System.out.println("Count of number is :"+count);
		
		sc.close();
	}
}
