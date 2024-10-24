package basicprograms;

public class floats{
    public static void main(String[] args) {
        //Function: isNaN()Purpose: Determines if the specified Float value is "Not-a-Number" (NaN).
        //Parameters to be Passed:None, when used with a Float object.
        //Example:
        Float num = Float.NaN;
        System.out.println(num.isNaN());
        //Return Type:boolean: true if the value is NaN, otherwise false.

        //Function: floatValue() Purpose: Returns the value of the Float object as a primitive float.
        //Parameters to be Passed:None. It works on the current Float object.
        //Example:
        Float numb = 3.14f;
        float primitiveNum = numb.floatValue();
        System.out.println(primitiveNum);
         //Return Type:float: the primitive float value.


        //Function: compare() Purpose: Compares two float values.
        //Parameters to be Passed:Two parameters: two float values to compare.
        //Example:
        float num1 = 3.14f;
        float num2 = 2.71f;
        System.out.println(Float.compare(num1, num2)); // Output: 1 (since 3.14 > 2.71)
        System.out.println(Float.compare(num2, num1));
        //Return Type: int: 0 if both float values are equal,Positive value if the first float is greater,Negative value if the first float is smaller.


        //Function: byteValue()Purpose: Converts the Float value to a primitive byte.
        //Parameters to be Passed:None. It works on the current Float object.
        //Example:
        Float numz = 123.45f;
        byte byteValue = numz.byteValue();
        System.out.println(byteValue);
        //Return Type:byte: the byte representation of the Float value (truncated if necessary).



        //Function: shortValue() Purpose: Converts the Float value to a primitive short.
        //Parameters to be Passed: None. It works on the current Float object.
        //Example:
        
        Float numx = 12345.67f;
        short shortValue = numx.shortValue();
        System.out.println(shortValue);
         //Return Type:short: the short representation of the Float value (truncated if necessary).

    }
}
