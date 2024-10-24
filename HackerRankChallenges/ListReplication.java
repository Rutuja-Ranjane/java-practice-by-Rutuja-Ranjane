import java.util.Scanner;

public class ListReplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int[] array = new int[n+1];

        for (int i = 0; i <=n; i++) {
            System.out.println("enter the values");
            array[i]= sc.nextInt();
        }
        for (int j = 0; j <=n; j++) {
            for(int k =1; k<=n; k++){
                System.out.println(array[j]);
            }

        }
    }
}
