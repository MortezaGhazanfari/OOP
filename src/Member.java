import java.util.ArrayList;
import java.util.List;

public class Member extends Person implements Interact{
    public static int currentId = 1;
    private int memberId;
    private boolean activeMember;

    private List<Media> lent;



    public Member(String name, int age, int memberId, boolean activeMember, List<Media> lent) {
        super(name, age);
        this.activeMember = activeMember;
        this.memberId=currentId++;
        this.lent = lent;
    }

    public int getMemberId() {
        return memberId;
    }



    @Override
    public void interactWithBook() {
        System.out.println(getName() + " has lent something. ");
    }
}
