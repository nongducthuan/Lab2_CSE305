
import java.util.ArrayList;
import java.util.List;

public class RegisteredUser {

    private List<User> listOfUsers;

    public RegisteredUser() {
        listOfUsers = new ArrayList<>();
    }

    public void addUser(User user) {
        if (!listOfUsers.contains(user)) {
            listOfUsers.contains(user);
            System.out.println("Successfull add user: " + user.toString());
            return;
        }
        System.out.println("Contained user: " + user.toString());
    }

    public boolean removeUser(User user) {
        if (listOfUsers.contains(user)) {
            listOfUsers.remove(user);
            System.out.println("Succeccfull remove user: " + user.toString());
            return true;
        }
        System.out.println("Donot contain user: " + user.toString());
        return false;
    }

    public List<User> getListOfUsers() {
        return listOfUsers;
    }

    public void setListOfUsers(List<User> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }

}
