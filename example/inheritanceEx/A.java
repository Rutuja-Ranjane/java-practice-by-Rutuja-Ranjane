package inheritanceEx;

public class A extends B implements User {
    public void displayUser() {
        System.out.println("Display from User interface");
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.displayB();      
        obj.displayUser();   
    }
}
