import java.util.*;
class player
{
    int p_scr =0;
    String name;
    int p_input;
    public player(String name)
    {
        this.name=name;
    }
    public void playerdetails()
    {
        System.out.println("Name of the player is "+name);
        System.out.println("player score = "+p_scr);
    }
}
class computer{ 
    int c_scr, c_pred;
    String name = "comuputer_robo";
    public int prediction(){
        Random r = new Random();
        return r.nextInt(2);
    }
    public void playerdetails()
    {
        System.out.println("Name of the computer is "+name);
        System.out.println("computer score = "+c_scr);        
    }

}

public class App 
{
    public static void main(String[] args) throws Exception
    {

        
        Scanner sc = new Scanner(System.in);
        player p= new player("Bahubali");
        computer c =new computer();
        // System.out.println("enter your name");
        // p.name= sc.nextLine();

        for(;;)
        {
            System.out.println("enter your coin");
            p.p_input= sc.nextInt();
            
            System.out.println("you entered"+p.p_input);
            c.c_pred = c.prediction();
            System.out.println("computer prediction"+c.c_pred);
            if(p.p_input==c.c_pred)
            {
                c.c_scr++;
                System.out.println("*************************current score**************************");
                p.playerdetails();
                c.playerdetails();

            }
            else
            {
                p.p_scr++;
                System.out.println("*************************current score**************************");
                p.playerdetails();
                c.playerdetails();
            }

            // System.out.println("score of player"+p.p_scr);
            // System.out.println("score of computer"+c.c_scr);
        
            if(p.p_scr==3)
            {
               System.out.println("************************Winner is***********************");
               p.playerdetails();
               System.out.println("***********************************************");
                // System.out.println("player is winner, computer better luck nexttime");
                break;
            }
            else if(c.c_scr==3)
            {
                System.out.println("************************Winner is***********************");
                c.playerdetails();
                System.out.println("***********************************************");
                // System.out.println("computer is winner, player better luck nexttime");
                break;
            }
        }
    }
}
