import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateList {
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
        
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0) {
                numbers.set(i, Math.abs(numbers.get(i)));
            }
        }

        System.out.println("Updated list:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
