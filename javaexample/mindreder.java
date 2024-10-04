package javaexample;
import java.util.*;

public class mindreder 
{
    public static void main(String[] args) throws Exception
    {
        int c_scr=0, p_scr=0;
        int c_pred=0;
        int p_input;
        Scanner sc = new Scanner(System.in);

        for(;;)
        {
            System.out.println("enter your coin");
            p_input= sc.nextInt();

            System.out.println("you entered"+p_input);

            if(p_input==c_pred)
            {
                c_scr++;
            }
            else
            {
                p_scr++;
            }

            System.out.println("score of player"+p_scr);
            System.out.println("score of computer"+c_scr);
        
            if(p_scr==3)
            {
                System.out.println("player is winner, computer better luck nexttime");
                break;
            }
            else if(c_scr==3)
            {
                System.out.println("computer is winner, player better luck nexttime");
                break;
            }
        }
    }
}
