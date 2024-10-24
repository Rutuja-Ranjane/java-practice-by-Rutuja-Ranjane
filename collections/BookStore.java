import java.util.*;

class book {
  String isbn, bookName,bookAuthor;

  public book(String isbn, String bookName, String bookAuthor) {
    this.isbn = isbn;
    this.bookName = bookName;
    this.bookAuthor = bookAuthor;
  }
  public void bookDetails()
  {
    System.out.println("isbn = "+isbn);
    System.out.println("BookName = "+bookName);
    System.out.println("BookAuthor = "+bookAuthor);

  }

    
}
class Category
{
  int c_id;
  String c_name;
  List<book> bkList;
  public Category(int c_id, String c_name, List<book> a) {
    this.c_id = c_id;
    this.c_name = c_name;
    this.bkList.add(new book(c_name, c_name, c_name));
  }

  
}


public class BookStore {
  public static void main(String[] args) {
    book b1 =new book("5432", "DBMS", "Rajiv Chopra");
    book b2 =new book("1234", "HTML", "Jon Duckett");
    book b3 =new book("7654", "Learn Java", "Herbert Schildt");
      
    List<book> bookList = new ArrayList<book>();
    
    
    bookList.add(b1);
    bookList.add(b2);
    bookList.add(b3);
    bookList.add(new book("2314", "Learn C", "Faizan"));
    //bookList.add(new book("2994", "Learn C", "Faizan"));

    List<Category> category = new ArrayList<Category>();

    for(int i=0;i<bookList.size();i++){
        book obj1 = bookList.get(i);
        obj1.bookDetails();
    }

  }  
}
