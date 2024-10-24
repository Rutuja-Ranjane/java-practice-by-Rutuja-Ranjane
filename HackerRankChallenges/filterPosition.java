import java.util.Scanner;
public class filterPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] array = new int[10]; 

        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Enter the values");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) 
        {
            if (i % 2 == 0)
            { 
                System.out.println(array[i]);
            }
        }
    }
}
