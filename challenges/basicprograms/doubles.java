package basicprograms;

public class doubles{
    public static void main(String[] args) {

        //Function: parseDouble() Purpose: Converts a String into a primitive double.
        //Parameters to be Passed: One parameter: a String representing a floating-point number in double precision.
        //Example:
        String str = "2.34159";
        double num = Double.parseDouble(str);
        System.out.println(num);
        //Return Type: double: the double value parsed from the string.

        //Function: sum() Purpose: Adds two double values.
        //Parameters to be Passed: Two parameters: two primitive double values.
        //Example:
        double num1 = 2.9;
        double num2 = 3.1;

        double result = Double.sum(num1, num2);
        System.out.println(result);
        //Return Type: double: the sum of the two values.

        
        //Function: max() Purpose: Returns the maximum of two double values.
        //Parameters to be Passed:
        //Two parameters: two primitive double values.
        //Example:
        double num3 = 2.14159;
        double num4 = 5.71828;
        double maxVal = Double.max(num3, num4);
        System.out.println(maxVal);
        //Return Type:double: the larger of the two values.


        //Function: min() Purpose: Returns the minimum of two double values.
        //Parameters to be Passed: Two parameters: two primitive double values.
        //Example:
        double num5 = 2.14159;
        double num6 = 5.71828;
        double minVal = Double.min(num5, num6);
        System.out.println(minVal);
        //Return Type: double: the smaller of the two values.



        //Function: longBitsToDouble() Purpose: Converts a long bit representation of a double into the actual double value.
        //Parameters to be Passed: One parameter: a long value representing the bits of the double.
        //Example:
        long bits = 0x400921FB54442D18L;
        double numv = Double.longBitsToDouble(bits);
        System.out.println(numv);
        //Return Type:double: the double value represented by the long bits.
    }
}