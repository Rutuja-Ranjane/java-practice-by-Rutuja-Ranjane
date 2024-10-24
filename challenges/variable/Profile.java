package variable;
import java.util.Scanner;

public class Profile {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your age");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your gender");
        String gender = sc.nextLine();

        System.out.println("Enter your job preference");
        String pre = sc.nextLine();
        sc.nextLine();

        System.out.println("Enter your nationality");
        String nationality = sc.nextLine();
        
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Job Preference "+pre);
        System.out.println("Nationality: "+nationality);
        System.out.println("The year is: "+(2024-age));
        
        sc.close();
    }

}
