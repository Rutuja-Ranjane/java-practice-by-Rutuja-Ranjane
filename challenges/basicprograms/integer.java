package basicprograms;

public class integer {

    public static void main(String[] args) {

        //equals() function
        //Parameters to be passed
        //return type
        //example

        //The .equals() method is used to compare two objects for equality.
        //It takes one parameter of type Object (any Java object).The parameter should be the object that you want to compare with the current object.
        // example:
        Integer num1 = 5;
        Integer num2 = 10;
        System.out.println(num1.equals(num2));
        //It returns a boolean value.true if the objects are considered equal, false otherwise.


        //Function: compareTo() Purpose: Compares two Integer objects numerically
        //Parameters to be Passed: One parameter: an Integer object to compare with the current object.
        //Example:

        System.out.println(num1.compareTo(num2));
        System.out.println(num2.compareTo(num1));
        //Return Type: int: 0 if both integers are equal, Positive value if the current integer is greater, Negative value if the current integer is smaller.

        //Function: parseInt() Purpose: Converts a String into a primitive int.
        //Parameters to be Passed:One parameter: a String representing a numeric value.
        //Example:
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);
        //Return Type: int: the integer value parsed from the string.

        //Function: valueOf() Purpose: Returns an Integer object holding the value of the specified int or String.
        // Parameters to be Passed:One parameter: either a String or an int value.
        //Example:
        Integer no1 = Integer.valueOf(num1);
        Integer no2 = Integer.valueOf(str);
        System.out.println(no1);
        System.out.println(no2);
        //Return Type: Integer: an Integer object representing the value.


        //Function: toString() Purpose: Converts an Integer object or a primitive int into a String.
        //Parameters to be Passed:One parameter: an int value (for the static version), or none if it's an Integer object.
        //Example:
        String str1 = num1.toString(); 
        String str2 = Integer.toString(456); 
        System.out.println(str1); 
        System.out.println(str2);
         //Return Type:String: the string representation of the integer.





    }
}
