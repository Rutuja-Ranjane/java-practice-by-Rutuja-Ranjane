import java.util.Scanner;

public class Movie{
    public static void main(String[] args) {
        double price = 700.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();

        if(age<=55)
        {
            double d = price-(price*60)/100;
            System.out.println("your age is below 5 you have 60 percent discount your ammount is " +d);
        }
        else if(age>=60)
        {
            double d = price-(price*55)/100;
            System.out.println("your age is above 60 you have 55 percent discount your ammount is " + d); 
        }
        else
        {
            System.out.println("you dont have any discount your ammount is " + price);  
        }
    }
}
