package ControlFlowExamples;
import java.util.Scanner;

public class TollPlaza
{
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the vehicle type 1.car 2.bus 3.heavy vehicle");
        int Vehicle = sc.nextInt();
        int toll;

        if(Vehicle == 1)
        {
            toll = 100;
            System.out.println("your toll for car is = "+ toll);
            System.out.println("how many members are there in car");
            int member = sc.nextInt();

            if (member<=5 && member>=1)
            {
                toll = 100+(10*member);
                System.out.println("your total toll amount for car including members is = " + toll);
            }
            else{

            }
        }
        else if (Vehicle == 2) 
        {
            toll = 400;
            System.out.println("The toll for Bus is = " + toll);
        }
        else if (Vehicle == 3) 
        {
            toll = 700;
            System.out.println("The toll for heavy vehicle is = " + toll); 
        }
        else
        {
            System.out.println("please enter correct input");
        }
        sc.close();

    }
}