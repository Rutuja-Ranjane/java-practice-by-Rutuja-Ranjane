public class Book
{
    private String isbn;
    private String book_Name;
    private String author_Name;

    public Book(String isbn, String bname, String author) {
        this.isbn = isbn;
        this.book_Name = bname;
        this.author_Name = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getBname() {
        return book_Name;
    }

    public String getAuthor() {
        return author_Name;
    }

    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", bname=" + book_Name + ", author=" + author_Name + "]";
    }

    

}