import java.util.Date;

public abstract class Creator extends Person{
    private boolean isActive;
    private Date activeSince;
    public Creator(String name, int age, boolean isActive, Date activeSince) {
        super(name, age);
        this.activeSince = activeSince;
        this.isActive = isActive;
    }

}
