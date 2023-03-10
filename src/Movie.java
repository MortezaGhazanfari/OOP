import java.util.Date;

public class Movie extends Media{

    private Category category;

    private Producer producer;

    public Movie(String title, Date publishedDate, boolean available, Category category, Producer producer) {
        super(title, publishedDate, available);
        this.category = category;
        this.producer = producer;
    }
}
