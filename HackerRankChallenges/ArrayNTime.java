import java.util.Scanner;

public class ArrayNTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] resultArray = new int[n];
        
        for (int i = 0; i < n; i++) {
            resultArray[i] = i;
        }
        
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
            if (i < resultArray.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
