package logicalop;

import java.util.Scanner;

public class weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter your weight: ");
        double weight = sc.nextDouble();

        System.out.println("Enter your height: ");
        double height = sc.nextDouble();

        double bmi = weight/(height*height);
        System.out.println("your BMI is: " + bmi);
        if (bmi < 18) 
        {
            System.out.println("Your BMI is underweight");
        } 
        else if(bmi >= 18 && bmi < 23) 
        {
            System.out.println("You have normal weight ");
        } 
        else if (bmi >= 23 && bmi < 29.9) 
        {
            System.out.println("Your BMI is overweight.");
        } 
        else 
        {
            System.out.println("Your BMI is obesity.");
        }

    }

}
