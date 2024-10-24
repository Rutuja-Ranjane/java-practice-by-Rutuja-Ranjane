package Exception;

public class ArithExcep 
{
        public static void main(String[] args) {
            try{    
                int a = 50/0; //ArithmeticException 
            }
             catch(ArithmeticException e)
            {
                System.out.println(e);
            }   
             System.out.println("rest of the code...");  
        }
}  

