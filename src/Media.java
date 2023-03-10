import java.util.Date;

public abstract class Media {
    private String title;
    private Date publishedDate;
    private boolean available;



    public Media(String title, Date publishedDate, boolean available) {
        this.title = title;
        this.publishedDate = publishedDate;
        this.available = available;

    }
}
