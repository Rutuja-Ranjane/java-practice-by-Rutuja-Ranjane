import java.util.ArrayList;
import java.util.List;

class Node
{
    int key;
    int value;
    Node(int key, int value)
    {
        this.key= key;
        this.value=value;
    }
}
// hash table function

class HashTable
{
    private int size;
    private List<List<Node>>table;
    HashTable(int size)
    {
        this.size=size;
        this.table=new ArrayList<>(size);
        for(int i=0; i<size;i++)
        {
            table.add(new ArrayList<>());
        }
        
    }
    public int HashFunction(int key)
    {
        return key% size;
    }

    public void insert(int key,int value)
    {
        int index = HashFunction(key);
        List<Node> list = table.get(index);
        Node n = new Node(key,value);
        list.add(n);
    }
    int search(int key)
    {
        int index = HashFunction(key);
        List<Node> list = table.get(index);
        for(Node node:list)
        {
            if(node.key==key)
            {
                return node.value;
            }

        }
        return -1;
    }


}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int tablesize=10;
        HashTable ht=new HashTable(tablesize);

        ht.insert(4,500);
        ht.insert(8,800);
        ht.insert(55,200);

        if(ht.search(55)!=-1)
        {
            System.out.println("Key is found and it's value is "+ht.search(55));
        }
        else
        {
            System.out.println("key not found");
        }


    }
}
