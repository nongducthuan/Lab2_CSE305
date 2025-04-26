import java.util.ArrayList;
import java.util.List;

public class Tenant {
    private User user;
    private List<RentalContract> listOfContract;

    public Tenant(User user) {
        this.user = user;
        this.listOfContract = new ArrayList<>();
    }

    public void requestCreateRentalContract(RentalContract contract) {
        listOfContract.add(contract);
    }

    public void requestTerminateRentalContract(String contractID) {
        listOfContract.removeIf(c -> c.getContractID().equals(contractID));
    }

    public List<RentalContract> getListOfContract() {
        return listOfContract;
    }

    public User getUser() {
        return user;
    }
}
