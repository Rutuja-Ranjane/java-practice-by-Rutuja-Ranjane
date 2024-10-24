package Exception;

public class NullPointerExcep 
{

    public static void main(String[] args) {
        try{    
            String s = null;
            System.out.println(s.length()); //NullPointerException
        }
         catch(Exception e)
        {
            System.out.println(e);
        }   
        System.out.println("rest of the code...");  
    }

}
