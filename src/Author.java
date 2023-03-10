import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Author extends Creator implements Interact{
    private List<Book> books;
    public Author(String name, int age, boolean isActive, Date activeSince, List<Book> books) {
        super(name, age, isActive, activeSince);
        this.books = books;
    }

    @Override
    public void interactWithBook() {
        System.out.println(getName() + " wrote this book. ");
    }
}
