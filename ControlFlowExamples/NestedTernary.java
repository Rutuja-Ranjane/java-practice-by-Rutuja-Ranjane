package ControlFlowExamples;

public class NestedTernary {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 7;
        int n3 = 5;
        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
        System.out.println("Largest Number: " + largest); 
    }
}
