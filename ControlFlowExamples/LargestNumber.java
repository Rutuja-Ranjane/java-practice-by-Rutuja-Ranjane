package ControlFlowExamples;

public class LargestNumber {
    public static void main(String[] args) {
        int a =5, b=7, c=1;
        if(a>=b)
        {
            if(a>=c)
            {
                System.out.println("largest number " + a);
            }
            else{
                System.out.println("largest number " +c);
            }
        }
        else
        {
            if(b>=c)
            {
                System.out.println("largest number " + b);
            }
            else
            {
                System.out.println("largest number " +c);
            }

        }
    }
    
}
