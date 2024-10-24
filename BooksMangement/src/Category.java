import java.util.ArrayList;
import java.util.List;

public class Category {
    
    private int id;
    private String Category_name;
    private List<Book> Category_bookList;

    public Category(int id, String cname) {
        this.id = id;
        this.Category_name = cname;
        this.Category_bookList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getCname() {
        return Category_name;
    }

    public void addBook(Book book) {
        Category_bookList.add(book);
    }

    public List<Book> getCbookList() {
        return Category_bookList;
    }

    @Override
    public String toString() {
        return "Category [id = " + id + ", Category_name = " + Category_name + ", Category_bookList = " + Category_bookList + "]";
    }
     
    public void add_Category(Book b){
        this.Category_bookList.add(b);
    }


}
