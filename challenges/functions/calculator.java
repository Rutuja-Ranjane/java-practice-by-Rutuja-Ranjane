package functions;
import java.util.*;
public class calculator {
    
    private static void add(int a, int b){
        System.out.println("addition of a and b="+(a+b));
    }
    private static void Sub(int a, int b){
        System.out.println("substraction of a and b="+(a-b));
    } 
    private static void multi(int a, int b){
        System.out.println("multiplication of a and b="+(a*b));
    } 
    private static void div(int a, int b){
        System.out.println("Division of a and b="+(a/b));
    } 
    private static void SquareRoot(int a){
        System.out.println("Square Root of "+ a +"is "+ Math.sqrt(a));
    }
    private static void powerOff(int a, int b){
        System.out.println("power of a and b is"+Math.pow(a,b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of A ");
        int a = sc.nextInt();
        System.out.println("enter the value of B");
        int b = sc.nextInt();
        add(a,b);
        Sub(a,b);
        multi(a,b);
        div(a,b);
        SquareRoot(a);
        powerOff(a, b);

        sc.close();
    }

}
