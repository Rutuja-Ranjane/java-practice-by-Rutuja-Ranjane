package ControlFlowExamples;


public class SumOfNnumbers {
    public static void main(String[] args) {
        int sum =0;

        for(int i=0; i<=1000;i++)
        {
            sum = sum+i;
            // System.out.println(sum);
        }
        System.out.println("sum of total numbers =" +sum);
    }
}
