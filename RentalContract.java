public class RentalContract {
    String contractID;
    String propertyID;
    String tenantID;
    double rentAmount;

    public RentalContract(String contractID, String propertyID, String tenantID, double rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    public void createContract() {
        System.out.println("Rental contract created.");
    }

    public void terminateContract() {
        System.out.println("Rental contract terminated.");
    }
}
