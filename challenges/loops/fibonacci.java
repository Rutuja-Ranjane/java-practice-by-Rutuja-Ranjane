package loops;
public class fibonacci {
    public static void main(String[] args) {
        int i = 0;
        int n1 = 1;
        int n2;
        System.out.println(i);
        System.out.println(n1);
        do
        {       
            n2 = i + n1;
            System.out.println(n2);

            i = n1;
            n1 = n2;          
        } 
        while ( i<= 20);
    }
}
