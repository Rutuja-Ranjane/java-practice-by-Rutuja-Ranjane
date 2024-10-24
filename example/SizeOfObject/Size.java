package SizeOfObject;
import java.lang.instrument.Instrumentation;
// import java.util.ArrayList;

public class Size {

    private static volatile Instrumentation globalInstrumentation;

    // premain method to initialize the Instrumentation instance
    public static void premain(String agentArgs, Instrumentation inst) 
    {
        globalInstrumentation = inst;
    }

    // Method to get the size of an object
    public static long getObjectSize(Object object) {
        if (globalInstrumentation == null) {
            throw new IllegalStateException("Agent not initialized.");
        }
        return globalInstrumentation.getObjectSize(object);
    }
    public static void main(String[] args) {
        int intV =10;
        float floatV= 10;
        String strV= "aaa";
        long longV= 1202;
        byte byteV = 1;
        int[] intArray={1,2,3,4,5};
        
        System.out.println("Size of the object: " + getObjectSize(strV) + " bytes");
    }
    
}
