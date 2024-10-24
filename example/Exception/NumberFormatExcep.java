package Exception;

public class NumberFormatExcep {
   
    public static void main(String[] args) {
        try{    
            String s = "abc";
            int i = Integer.parseInt(s); //NumberFormatException
        }
         catch(Exception e)
        {
            System.out.println(e);
        }   
        System.out.println("rest of the code...");  
    } 
}
