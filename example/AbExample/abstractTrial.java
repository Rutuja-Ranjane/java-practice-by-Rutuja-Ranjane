abstract class Animal {
    abstract void sound();
}

class car{
    void run()
    {
        System.out.println("car is running");
    }
}
public class abstractTrial{

    public static void main(String[] args) {

        Animal cat= new Animal(){ /// Anonymous class
            void sound(){
                System.out.println("Maow");
            }
        };
        cat.sound();
        car c1 = new car(){
            void run()
            {
                System.out.println(" i am called from anonymous car is running"); 
            }
        };
        c1.run();
        car c2 = new car();
        c2.run();
    }

}