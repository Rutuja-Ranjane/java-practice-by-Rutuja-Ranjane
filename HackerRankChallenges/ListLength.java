import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        
        List<Integer> numbers = new ArrayList<>();
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }
    
        int length = numbers.size();
        System.out.println("The length of the list is: " + length);
        
    }
}
