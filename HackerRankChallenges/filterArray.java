import java.util.Scanner;
public class filterArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the upper Limit");
        int upperLimit = sc.nextInt();
        int[] numbers = new int[10];

        for (int i = 0; i<10; i++) 
        {
            System.out.println("enter the values");
            numbers[i]= sc.nextInt();
        }
        System.out.println("values that are below "+upperLimit +" limit");
        for (int i = 0; i <10; i++) 
        {
            if (numbers[i] < upperLimit) 
            {
                System.out.println(numbers[i]);
            }
        }
    }
}
