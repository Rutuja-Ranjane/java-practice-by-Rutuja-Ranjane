package logicalop;
import java.util.*;
public class Grader {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your score");
            int score = sc. nextInt();

            if(score <=3)
            {
                System.out.println("you failed");
            }
            else if(score >3 && score <5)
            {
                System.out.println("Insufficient");
            }
            else if(score>5 && score <=8)
            {
                System.out.println("Good");
            }
            else if(score<= 10 && score >=9)
            {
                System.out.println("Excellent Grade");
            }
            else
            {
                System.out.println("outside 0-10");
            }
        }
}
