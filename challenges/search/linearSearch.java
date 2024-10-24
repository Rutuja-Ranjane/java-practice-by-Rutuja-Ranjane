package search;
import java.util.*;

class LinearSearch
{
    public static void main(String[] args) {
        int value, no,array[],posi= -1; 
        System.out.println("enter the number of element you want in array");
        Scanner sc = new Scanner(System.in);
        no= sc.nextInt();
        array = new int[no];
        
        System.out.println("enter the element");
        for(int i=0; i<no; i++)
        {
            array[i]= sc.nextInt();
        }
        System.out.println("your elements");
        for(int i=0; i<no;i++ ){
            System.out.println(array[i]); 
        }

        System.out.println("enter your value that you want to find out");
        value=sc.nextInt();

        for(int i=0;i<no;i++)
        {
            if(array[i]==value)
            {
                System.out.println(value+"is found at " + i );
                break;
            }
            else
            {
                System.out.println("value not found"+posi);
            }
        }
               

    }
}