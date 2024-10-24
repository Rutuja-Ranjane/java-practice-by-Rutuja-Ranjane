import java.util.*;  
class ArrayListC
{  
    public static void main(String args[])
    {  
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
        System.out.println("array List status");
        list.add("Ravi");
        printList(list);
        System.out.println("array List status");
        list.add("Vijay");  
        printList(list);
        System.out.println("array List status");
        list.add("Ravi");
        printList(list);  
        System.out.println("array List status");
        list.add("Ajay");  
        printList(list);
        System.out.println("array List status");

        list.add(4, "Rushi");  // Add elemrnt in specific index
		System.out.println(list.add("Shivansh")); // return boolean
        printList(list);
        System.out.println("set the value at ");
        list.set(2, "Abhi");
        printList(list);
        System.out.println("value at that position is "+list.get(2));

        list.remove(3);

        System.out.println("before clear");
        printList(list);
        list.clear();
        System.out.println("after clear");
        printList(list);

          
    }  
    public static void printList(List a)
    {
        Iterator itr=a.iterator();   
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        } 
    }
}  