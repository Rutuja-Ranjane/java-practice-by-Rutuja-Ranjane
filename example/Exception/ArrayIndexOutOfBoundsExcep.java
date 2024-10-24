package Exception;

public class ArrayIndexOutOfBoundsExcep {
    
    public static void main(String[] args) {
        try{    
            int a[] = new int[5];
            a[10] = 50; //ArrayIndexOutOfBoundsException
        }
         catch(Exception e)
        {
            System.out.println(e);
        }   
        System.out.println("rest of the code...");  
    }
}
