import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Producer extends Creator{

    private List<Movie> movies;
    public Producer(String name, int age, boolean isActive, Date activeSince, List<Movie> movies) {
        super(name, age, isActive, activeSince);
        this.movies=movies;
    }
}
