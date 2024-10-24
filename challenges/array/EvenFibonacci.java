package array;
public class EvenFibonacci {
    public static void main(String[] args) {
        long[] evenFibonacci = new long[20];
        
        long a = 0; 
        long b = 1; 
        int count = 0;


        for(int i=0; i<60;i++){
            long next= a+b;
            a = b;
            b = next;
            if (a % 2 == 0){
                evenFibonacci[count] = a;
                count++;
            }
        }
        for (int i = 0; i < evenFibonacci.length; i++) {
            System.out.println("[a["+i+"]=" + evenFibonacci[i] + "]");
        }
        long Sum = 0;
        for (int i=0; i< evenFibonacci.length; i++){
            Sum = Sum + evenFibonacci[i];
        }
       System.out.println(Sum);


    }
}
