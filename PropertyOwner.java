import java.util.ArrayList;
import java.util.List;

public class PropertyOwner {
    private User user;
    private List<Property> listOfProperties;

    public PropertyOwner(User user) {
        this.user = user;
        this.listOfProperties = new ArrayList<>();
    }

    public void addProperty(Property property) {
        listOfProperties.add(property);
    }

    public void removeProperty(String propertyID) {
        listOfProperties.removeIf(p -> p.getPropertyID().equals(propertyID));
    }

    public List<Property> getListOfProperties() {
        return listOfProperties;
    }

    public User getUser() {
        return user;
    }
}
