import java.util.ArrayList;
import java.util.List;

public class UserDB {
    List<User> userDBS = new ArrayList<>();

    UserDB(){
        userDBS.add(new User("winta","123"));
        userDBS.add(new User("livan","pass123"));
    }

    public List<User> getUserDBS() {
        return userDBS;
    }
}
