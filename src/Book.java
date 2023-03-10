import java.util.Date;

public class Book extends Media{
    private int numberOfPages;
    private Author author;
    private Category category;
    public Book(String title, Date publishedDate, boolean available, Author author, int numberOfPages, Category category) {
        super(title, publishedDate, available);
        this.numberOfPages = numberOfPages;
        this.category = category;
        this.author = author;
    }
}
