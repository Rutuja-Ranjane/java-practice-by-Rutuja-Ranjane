package variable;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the diameter of the circle: ");
        int dia = sc.nextInt();

        double r = (double) dia / 2;
        System.out.println(r);

        double area = Math.PI * r * r;
        System.out.println("The area of the circle is: " +area);
        double perimeter = 2 * Math.PI * r;
        System.out.println("The perimeter of the circle is: " +perimeter);

    }
}
