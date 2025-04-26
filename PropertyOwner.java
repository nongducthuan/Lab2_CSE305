
import java.util.ArrayList;

public class PropertyOwner {

    private User user;
    private ArrayList<Property> listOfProperties;

    public PropertyOwner(User user) {
        this.user = user;
        this.listOfProperties = new ArrayList<>();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Property> getListOfProperties() {
        return listOfProperties;
    }

    public void addProperty(Property property) {
        property.setPropertyOwnerID(user.getUserID());
        listOfProperties.add(property);
    }

    public void removeProperty(Property property) {
        listOfProperties.remove(property);
    }

    @Override
    public String toString() {
        return "PropertyOwner{"
                + "user=" + user
                + ", listOfProperties=" + listOfProperties
                + '}';
    }
}
